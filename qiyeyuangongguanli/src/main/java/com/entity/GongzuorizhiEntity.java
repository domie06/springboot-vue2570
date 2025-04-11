package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 工作日志
 *
 * @author 
 * @email
 */
@TableName("gongzuorizhi")
public class GongzuorizhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuorizhiEntity() {

	}

	public GongzuorizhiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Gongzuorizhi{" +
            "id=" + id +
            ", yuangongId=" + yuangongId +
            ", gongzuorizhiName=" + gongzuorizhiName +
            ", gongzuorizhiTypes=" + gongzuorizhiTypes +
            ", gongzuorizhiContent=" + gongzuorizhiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
