package com.my.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mapper.ScienceNewsMapper;
import com.my.pojo.RecommendNews;
import com.my.pojo.ScienceNews;
import com.my.service.ScienceNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScienceNewsImpl extends ServiceImpl<ScienceNewsMapper, ScienceNews> implements ScienceNewsService {

    @Autowired
    private ScienceNewsMapper scienceNewsMapper;

    public List<ScienceNews> selectNews() {
        QueryWrapper<ScienceNews> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("title","date");
        return scienceNewsMapper.selectList(queryWrapper);
    }

}
