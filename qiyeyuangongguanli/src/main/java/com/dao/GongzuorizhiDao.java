package com.dao;

import com.entity.GongzuorizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuorizhiView;

/**
 * 工作日志 Dao 接口
 *
 * @author 
 */
public interface GongzuorizhiDao extends BaseMapper<GongzuorizhiEntity> {

   List<GongzuorizhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
