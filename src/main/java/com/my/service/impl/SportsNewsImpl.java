package com.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mapper.RecommendNewsMapper;
import com.my.mapper.SportsNewsMapper;
import com.my.pojo.RecommendNews;
import com.my.pojo.SportsNews;
import com.my.service.RecommendNewsService;
import com.my.service.SportsNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportsNewsImpl extends ServiceImpl<SportsNewsMapper, SportsNews> implements SportsNewsService {

    @Autowired
    private SportsNewsMapper sportsNewsMapper;

    public List<SportsNews> selectNews() {
        QueryWrapper<SportsNews> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("title","date");
        return sportsNewsMapper.selectList(queryWrapper);
    }

}
