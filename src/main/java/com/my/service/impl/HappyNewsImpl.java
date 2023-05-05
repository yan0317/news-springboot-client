package com.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mapper.HappyNewsMapper;
import com.my.mapper.RecommendNewsMapper;
import com.my.pojo.HappyNews;
import com.my.pojo.RecommendNews;
import com.my.service.HappyNewsService;
import com.my.service.RecommendNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HappyNewsImpl extends ServiceImpl<HappyNewsMapper, HappyNews> implements HappyNewsService {

    @Autowired
    private HappyNewsMapper happyNewsMapper;

    public List<HappyNews> selectNews() {
        QueryWrapper<HappyNews> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("title","date");
        return happyNewsMapper.selectList(queryWrapper);
    }

}
