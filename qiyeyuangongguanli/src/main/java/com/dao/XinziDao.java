package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XinziEntity;
import com.entity.view.XinziView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 薪资 Dao 接口
 *
 * @author 
 */
public interface XinziDao extends BaseMapper<XinziEntity> {

   List<XinziView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
