package com.entity.model;

import com.entity.ShangjipishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 上级批示
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangjipishiModel implements Serializable {
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
     * 领导
     */
    private Integer lingdaoId;


    /**
     * 批示标题
     */
    private String shangjipishiName;


    /**
     * 批示类型
     */
    private Integer shangjipishiTypes;


    /**
     * 批示附件
     */
    private String shangjipishiFile;


    /**
     * 批示内容
     */
    private String shangjipishiContent;


    /**
     * 是否接受
     */
    private Integer shangjipishiYesnoTypes;


    /**
     * 理由
     */
    private String shangjipishiYesnoText;


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
	 * 获取：领导
	 */
    public Integer getLingdaoId() {
        return lingdaoId;
    }


    /**
	 * 设置：领导
	 */
    public void setLingdaoId(Integer lingdaoId) {
        this.lingdaoId = lingdaoId;
    }
    /**
	 * 获取：批示标题
	 */
    public String getShangjipishiName() {
        return shangjipishiName;
    }


    /**
	 * 设置：批示标题
	 */
    public void setShangjipishiName(String shangjipishiName) {
        this.shangjipishiName = shangjipishiName;
    }
    /**
	 * 获取：批示类型
	 */
    public Integer getShangjipishiTypes() {
        return shangjipishiTypes;
    }


    /**
	 * 设置：批示类型
	 */
    public void setShangjipishiTypes(Integer shangjipishiTypes) {
        this.shangjipishiTypes = shangjipishiTypes;
    }
    /**
	 * 获取：批示附件
	 */
    public String getShangjipishiFile() {
        return shangjipishiFile;
    }


    /**
	 * 设置：批示附件
	 */
    public void setShangjipishiFile(String shangjipishiFile) {
        this.shangjipishiFile = shangjipishiFile;
    }
    /**
	 * 获取：批示内容
	 */
    public String getShangjipishiContent() {
        return shangjipishiContent;
    }


    /**
	 * 设置：批示内容
	 */
    public void setShangjipishiContent(String shangjipishiContent) {
        this.shangjipishiContent = shangjipishiContent;
    }
    /**
	 * 获取：是否接受
	 */
    public Integer getShangjipishiYesnoTypes() {
        return shangjipishiYesnoTypes;
    }


    /**
	 * 设置：是否接受
	 */
    public void setShangjipishiYesnoTypes(Integer shangjipishiYesnoTypes) {
        this.shangjipishiYesnoTypes = shangjipishiYesnoTypes;
    }
    /**
	 * 获取：理由
	 */
    public String getShangjipishiYesnoText() {
        return shangjipishiYesnoText;
    }


    /**
	 * 设置：理由
	 */
    public void setShangjipishiYesnoText(String shangjipishiYesnoText) {
        this.shangjipishiYesnoText = shangjipishiYesnoText;
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
