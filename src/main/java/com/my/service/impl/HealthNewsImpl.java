package com.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mapper.HealthNewsMapper;
import com.my.mapper.RecommendNewsMapper;
import com.my.pojo.HealthNews;
import com.my.pojo.RecommendNews;
import com.my.service.HealthNewsService;
import com.my.service.RecommendNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthNewsImpl extends ServiceImpl<HealthNewsMapper, HealthNews> implements HealthNewsService {

    @Autowired
    private HealthNewsMapper healthNewsMapper;

    public List<HealthNews> selectNews() {
        QueryWrapper<HealthNews> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("title","date");
        return healthNewsMapper.selectList(queryWrapper);
    }

}
