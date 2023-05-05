package com.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mapper.BusinessNewsMapper;
import com.my.mapper.RecommendNewsMapper;
import com.my.pojo.BusinessNews;
import com.my.pojo.RecommendNews;
import com.my.service.BusinessNewsService;
import com.my.service.RecommendNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessNewsImpl extends ServiceImpl<BusinessNewsMapper, BusinessNews> implements BusinessNewsService {

    @Autowired
    private BusinessNewsMapper businessNewsMapper;

    public List<BusinessNews> selectNews() {
        QueryWrapper<BusinessNews> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("title","date");
        return businessNewsMapper.selectList(queryWrapper);
    }

}
