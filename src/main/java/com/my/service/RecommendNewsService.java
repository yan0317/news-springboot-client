package com.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.pojo.RecommendNews;

import java.util.List;

public interface RecommendNewsService extends IService<RecommendNews> {
    List<RecommendNews> selectNews();

}
