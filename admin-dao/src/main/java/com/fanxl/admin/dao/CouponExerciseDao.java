package com.fanxl.admin.dao;

import com.fanxl.admin.entity.CouponExercise;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/9 0009 21:49
 */
@Repository
public interface CouponExerciseDao extends Mapper<CouponExercise> {

    /**
     * 获取优惠活动
     * @return
     */
    CouponExercise getCoupon();

}