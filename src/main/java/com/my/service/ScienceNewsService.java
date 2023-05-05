package com.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.pojo.RecommendNews;
import com.my.pojo.ScienceNews;

import java.util.List;

public interface ScienceNewsService extends IService<ScienceNews> {
    List<ScienceNews> selectNews();

}
