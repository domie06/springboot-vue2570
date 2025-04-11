package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.QingjiaEntity;
import com.entity.view.QingjiaView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 请假 Dao 接口
 *
 * @author 
 */
public interface QingjiaDao extends BaseMapper<QingjiaEntity> {

   List<QingjiaView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
