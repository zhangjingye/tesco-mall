package com.jerusalem.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerusalem.common.utils.PageUtils;
import com.jerusalem.coupon.entity.SeckillSessionEntity;

import java.util.List;
import java.util.Map;

/****
 * 服务层接口
 * 秒杀活动场次
 * @author jerusalem
 * @email 3276586184@qq.com
 * @date 2020-04-25 13:53:20
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    /**
    * 分页查询
    * @param params
    * @return
    */
    PageUtils queryPage(Map<String, Object> params);

    /***
     * 获取最近三天的秒杀商品
     * @return
     */
    List<SeckillSessionEntity> getLatest3DaysSession();
}

