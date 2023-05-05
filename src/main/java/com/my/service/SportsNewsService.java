package com.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.pojo.RecommendNews;
import com.my.pojo.SportsNews;

import java.util.List;

public interface SportsNewsService extends IService<SportsNews> {
    List<SportsNews> selectNews();

}
