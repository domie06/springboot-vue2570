package com.entity.vo;

import com.entity.ShangjipishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 上级批示
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangjipishi")
public class ShangjipishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 领导
     */

    @TableField(value = "lingdao_id")
    private Integer lingdaoId;


    /**
     * 批示标题
     */

    @TableField(value = "shangjipishi_name")
    private String shangjipishiName;


    /**
     * 批示类型
     */

    @TableField(value = "shangjipishi_types")
    private Integer shangjipishiTypes;


    /**
     * 批示附件
     */

    @TableField(value = "shangjipishi_file")
    private String shangjipishiFile;


    /**
     * 批示内容
     */

    @TableField(value = "shangjipishi_content")
    private String shangjipishiContent;


    /**
     * 是否接受
     */

    @TableField(value = "shangjipishi_yesno_types")
    private Integer shangjipishiYesnoTypes;


    /**
     * 理由
     */

    @TableField(value = "shangjipishi_yesno_text")
    private String shangjipishiYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：领导
	 */
    public Integer getLingdaoId() {
        return lingdaoId;
    }


    /**
	 * 获取：领导
	 */

    public void setLingdaoId(Integer lingdaoId) {
        this.lingdaoId = lingdaoId;
    }
    /**
	 * 设置：批示标题
	 */
    public String getShangjipishiName() {
        return shangjipishiName;
    }


    /**
	 * 获取：批示标题
	 */

    public void setShangjipishiName(String shangjipishiName) {
        this.shangjipishiName = shangjipishiName;
    }
    /**
	 * 设置：批示类型
	 */
    public Integer getShangjipishiTypes() {
        return shangjipishiTypes;
    }


    /**
	 * 获取：批示类型
	 */

    public void setShangjipishiTypes(Integer shangjipishiTypes) {
        this.shangjipishiTypes = shangjipishiTypes;
    }
    /**
	 * 设置：批示附件
	 */
    public String getShangjipishiFile() {
        return shangjipishiFile;
    }


    /**
	 * 获取：批示附件
	 */

    public void setShangjipishiFile(String shangjipishiFile) {
        this.shangjipishiFile = shangjipishiFile;
    }
    /**
	 * 设置：批示内容
	 */
    public String getShangjipishiContent() {
        return shangjipishiContent;
    }


    /**
	 * 获取：批示内容
	 */

    public void setShangjipishiContent(String shangjipishiContent) {
        this.shangjipishiContent = shangjipishiContent;
    }
    /**
	 * 设置：是否接受
	 */
    public Integer getShangjipishiYesnoTypes() {
        return shangjipishiYesnoTypes;
    }


    /**
	 * 获取：是否接受
	 */

    public void setShangjipishiYesnoTypes(Integer shangjipishiYesnoTypes) {
        this.shangjipishiYesnoTypes = shangjipishiYesnoTypes;
    }
    /**
	 * 设置：理由
	 */
    public String getShangjipishiYesnoText() {
        return shangjipishiYesnoText;
    }


    /**
	 * 获取：理由
	 */

    public void setShangjipishiYesnoText(String shangjipishiYesnoText) {
        this.shangjipishiYesnoText = shangjipishiYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
