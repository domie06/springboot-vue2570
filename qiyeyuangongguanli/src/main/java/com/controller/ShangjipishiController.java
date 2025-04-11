
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 上级批示
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shangjipishi")
public class ShangjipishiController {
    private static final Logger logger = LoggerFactory.getLogger(ShangjipishiController.class);

    @Autowired
    private ShangjipishiService shangjipishiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private LingdaoService lingdaoService;
    @Autowired
    private YuangongService yuangongService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("普通员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        else if("领导".equals(role)){
            params.put("lingdaoId",request.getSession().getAttribute("userId"));
            LingdaoEntity userId = lingdaoService.selectById(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
            if(userId == null)
                return  R.error("查不到当前登录的领导账户");
            params.put("bumenTypes",userId.getBumenTypes());
        }
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shangjipishiService.queryPage(params);

        //字典表数据转换
        List<ShangjipishiView> list =(List<ShangjipishiView>)page.getList();
        for(ShangjipishiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShangjipishiEntity shangjipishi = shangjipishiService.selectById(id);
        if(shangjipishi !=null){
            //entity转view
            ShangjipishiView view = new ShangjipishiView();
            BeanUtils.copyProperties( shangjipishi , view );//把实体数据重构到view中

                //级联表
                LingdaoEntity lingdao = lingdaoService.selectById(shangjipishi.getLingdaoId());
                if(lingdao != null){
                    BeanUtils.copyProperties( lingdao , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLingdaoId(lingdao.getId());
                }
                //级联表
                YuangongEntity yuangong = yuangongService.selectById(shangjipishi.getYuangongId());
                if(yuangong != null){
                    BeanUtils.copyProperties( yuangong , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYuangongId(yuangong.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShangjipishiEntity shangjipishi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shangjipishi:{}",this.getClass().getName(),shangjipishi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("普通员工".equals(role))
            shangjipishi.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("领导".equals(role))
            shangjipishi.setLingdaoId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));


            shangjipishi.setShangjipishiYesnoTypes(1);
            shangjipishi.setCreateTime(new Date());
            shangjipishiService.insert(shangjipishi);
            return R.ok();

    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShangjipishiEntity shangjipishi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shangjipishi:{}",this.getClass().getName(),shangjipishi.toString());

        if("".equals(shangjipishi.getShangjipishiFile()) || "null".equals(shangjipishi.getShangjipishiFile())){
                shangjipishi.setShangjipishiFile(null);
        }
            shangjipishiService.updateById(shangjipishi);//根据id更新
            return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shangjipishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ShangjipishiEntity> shangjipishiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShangjipishiEntity shangjipishiEntity = new ShangjipishiEntity();
//                            shangjipishiEntity.setYuangongId(Integer.valueOf(data.get(0)));   //员工 要改的
//                            shangjipishiEntity.setLingdaoId(Integer.valueOf(data.get(0)));   //领导 要改的
//                            shangjipishiEntity.setShangjipishiName(data.get(0));                    //批示标题 要改的
//                            shangjipishiEntity.setShangjipishiTypes(Integer.valueOf(data.get(0)));   //批示类型 要改的
//                            shangjipishiEntity.setShangjipishiFile(data.get(0));                    //批示附件 要改的
//                            shangjipishiEntity.setShangjipishiContent("");//照片
//                            shangjipishiEntity.setShangjipishiYesnoTypes(Integer.valueOf(data.get(0)));   //是否接受 要改的
//                            shangjipishiEntity.setShangjipishiYesnoText(data.get(0));                    //理由 要改的
//                            shangjipishiEntity.setCreateTime(date);//时间
                            shangjipishiList.add(shangjipishiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        shangjipishiService.insertBatch(shangjipishiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
