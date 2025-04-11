package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DakaEntity;
import com.entity.view.DakaView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 打卡 Dao 接口
 *
 * @author 
 */
public interface DakaDao extends BaseMapper<DakaEntity> {

   List<DakaView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
