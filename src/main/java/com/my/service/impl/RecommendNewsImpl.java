package com.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mapper.RecommendNewsMapper;

import com.my.pojo.RecommendNews;

import com.my.service.RecommendNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendNewsImpl extends ServiceImpl<RecommendNewsMapper, RecommendNews> implements RecommendNewsService {

    @Autowired
    private RecommendNewsMapper newsMapper;

    public List<RecommendNews> selectNews() {
        QueryWrapper<RecommendNews> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("title","date");
        return newsMapper.selectList(queryWrapper);
    }

}
