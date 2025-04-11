package com.entity.model;

import com.entity.GongzuorizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作日志
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuorizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 日志标题
     */
    private String gongzuorizhiName;


    /**
     * 日志类型
     */
    private Integer gongzuorizhiTypes;


    /**
     * 日志详情
     */
    private String gongzuorizhiContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：日志标题
	 */
    public String getGongzuorizhiName() {
        return gongzuorizhiName;
    }


    /**
	 * 设置：日志标题
	 */
    public void setGongzuorizhiName(String gongzuorizhiName) {
        this.gongzuorizhiName = gongzuorizhiName;
    }
    /**
	 * 获取：日志类型
	 */
    public Integer getGongzuorizhiTypes() {
        return gongzuorizhiTypes;
    }


    /**
	 * 设置：日志类型
	 */
    public void setGongzuorizhiTypes(Integer gongzuorizhiTypes) {
        this.gongzuorizhiTypes = gongzuorizhiTypes;
    }
    /**
	 * 获取：日志详情
	 */
    public String getGongzuorizhiContent() {
        return gongzuorizhiContent;
    }


    /**
	 * 设置：日志详情
	 */
    public void setGongzuorizhiContent(String gongzuorizhiContent) {
        this.gongzuorizhiContent = gongzuorizhiContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
