package com.entity.vo;

import com.entity.GongzuorizhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作日志
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuorizhi")
public class GongzuorizhiVO implements Serializable {
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
     * 日志标题
     */

    @TableField(value = "gongzuorizhi_name")
    private String gongzuorizhiName;


    /**
     * 日志类型
     */

    @TableField(value = "gongzuorizhi_types")
    private Integer gongzuorizhiTypes;


    /**
     * 日志详情
     */

    @TableField(value = "gongzuorizhi_content")
    private String gongzuorizhiContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：日志标题
	 */
    public String getGongzuorizhiName() {
        return gongzuorizhiName;
    }


    /**
	 * 获取：日志标题
	 */

    public void setGongzuorizhiName(String gongzuorizhiName) {
        this.gongzuorizhiName = gongzuorizhiName;
    }
    /**
	 * 设置：日志类型
	 */
    public Integer getGongzuorizhiTypes() {
        return gongzuorizhiTypes;
    }


    /**
	 * 获取：日志类型
	 */

    public void setGongzuorizhiTypes(Integer gongzuorizhiTypes) {
        this.gongzuorizhiTypes = gongzuorizhiTypes;
    }
    /**
	 * 设置：日志详情
	 */
    public String getGongzuorizhiContent() {
        return gongzuorizhiContent;
    }


    /**
	 * 获取：日志详情
	 */

    public void setGongzuorizhiContent(String gongzuorizhiContent) {
        this.gongzuorizhiContent = gongzuorizhiContent;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
