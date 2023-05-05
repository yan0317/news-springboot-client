package com.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.pojo.HealthNews;
import com.my.pojo.RecommendNews;

import java.util.List;

public interface HealthNewsService extends IService<HealthNews> {
    List<HealthNews> selectNews();

}
