package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.QingjiaEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 请假
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qingjia")
public class QingjiaView extends QingjiaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 请假类型的值
		*/
		private String qingjiaValue;
		/**
		* 申请状态的值
		*/
		private String qingjiaYesnoValue;



	public QingjiaView() {

	}

	public QingjiaView(QingjiaEntity qingjiaEntity) {
		try {
			BeanUtils.copyProperties(this, qingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 请假类型的值
			*/
			public String getQingjiaValue() {
				return qingjiaValue;
			}
			/**
			* 设置： 请假类型的值
			*/
			public void setQingjiaValue(String qingjiaValue) {
				this.qingjiaValue = qingjiaValue;
			}
			/**
			* 获取： 申请状态的值
			*/
			public String getQingjiaYesnoValue() {
				return qingjiaYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setQingjiaYesnoValue(String qingjiaYesnoValue) {
				this.qingjiaYesnoValue = qingjiaYesnoValue;
			}












}
