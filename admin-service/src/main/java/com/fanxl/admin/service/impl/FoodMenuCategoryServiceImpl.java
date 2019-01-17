package com.fanxl.admin.service.impl;

import com.fanxl.admin.dao.FoodMenuCategoryDao;
import com.fanxl.admin.entity.FoodMenuCategory;
import com.fanxl.admin.service.FoodMenuCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/28 0028 19:46
 */
@Service
public class FoodMenuCategoryServiceImpl implements FoodMenuCategoryService {

    @Autowired
    private FoodMenuCategoryDao foodMenuCategoryDao;

    @Override
    public List<FoodMenuCategory> getAll() {
        return foodMenuCategoryDao.selectAll();
    }
    
    @Override
    public boolean create(FoodMenuCategory foodMenuCategory) {
        return foodMenuCategoryDao.insert(foodMenuCategory)>0;
    }

    @Override
    public boolean delete(Long id) {
        return foodMenuCategoryDao.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean update(FoodMenuCategory foodMenuCategory) {
        return foodMenuCategoryDao.updateByPrimaryKeySelective(foodMenuCategory)>0;
    }

    @Override
    public FoodMenuCategory getById(Long id) {
        return foodMenuCategoryDao.selectByPrimaryKey(id);
    }
}