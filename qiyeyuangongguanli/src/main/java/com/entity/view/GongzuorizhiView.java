package com.entity.view;

import com.entity.GongzuorizhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 工作日志
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongzuorizhi")
public class GongzuorizhiView extends GongzuorizhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 日志类型的值
		*/
		private String gongzuorizhiValue;



		//级联表 yuangong
			/**
			* 普通员工姓名
			*/
			private String yuangongName;
			/**
			* 普通员工手机号
			*/
			private String yuangongPhone;
			/**
			* 普通员工身份证号
			*/
			private String yuangongIdNumber;
			/**
			* 普通员工头像
			*/
			private String yuangongPhoto;
			/**
			* 部门
			*/
			private Integer bumenTypes;
				/**
				* 部门的值
				*/
				private String bumenValue;
			/**
			* 电子邮箱
			*/
			private String yuangongEmail;

	public GongzuorizhiView() {

	}

	public GongzuorizhiView(GongzuorizhiEntity gongzuorizhiEntity) {
		try {
			BeanUtils.copyProperties(this, gongzuorizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 日志类型的值
			*/
			public String getGongzuorizhiValue() {
				return gongzuorizhiValue;
			}
			/**
			* 设置： 日志类型的值
			*/
			public void setGongzuorizhiValue(String gongzuorizhiValue) {
				this.gongzuorizhiValue = gongzuorizhiValue;
			}














				//级联表的get和set yuangong
					/**
					* 获取： 普通员工姓名
					*/
					public String getYuangongName() {
						return yuangongName;
					}
					/**
					* 设置： 普通员工姓名
					*/
					public void setYuangongName(String yuangongName) {
						this.yuangongName = yuangongName;
					}
					/**
					* 获取： 普通员工手机号
					*/
					public String getYuangongPhone() {
						return yuangongPhone;
					}
					/**
					* 设置： 普通员工手机号
					*/
					public void setYuangongPhone(String yuangongPhone) {
						this.yuangongPhone = yuangongPhone;
					}
					/**
					* 获取： 普通员工身份证号
					*/
					public String getYuangongIdNumber() {
						return yuangongIdNumber;
					}
					/**
					* 设置： 普通员工身份证号
					*/
					public void setYuangongIdNumber(String yuangongIdNumber) {
						this.yuangongIdNumber = yuangongIdNumber;
					}
					/**
					* 获取： 普通员工头像
					*/
					public String getYuangongPhoto() {
						return yuangongPhoto;
					}
					/**
					* 设置： 普通员工头像
					*/
					public void setYuangongPhoto(String yuangongPhoto) {
						this.yuangongPhoto = yuangongPhoto;
					}
					/**
					* 获取： 部门
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 部门
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 部门的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 部门的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 电子邮箱
					*/
					public String getYuangongEmail() {
						return yuangongEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYuangongEmail(String yuangongEmail) {
						this.yuangongEmail = yuangongEmail;
					}


}
