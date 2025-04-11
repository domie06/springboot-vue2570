package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.entity.QingjiaEntity;
import com.utils.PageUtils;

import java.util.Map;

/**
 * 请假 服务类
 */
public interface QingjiaService extends IService<QingjiaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}