package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.entity.DakaEntity;
import com.utils.PageUtils;

import java.util.Map;

/**
 * 打卡 服务类
 */
public interface DakaService extends IService<DakaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}