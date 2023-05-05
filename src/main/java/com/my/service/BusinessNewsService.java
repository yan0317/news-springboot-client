package com.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.pojo.BusinessNews;
import com.my.pojo.RecommendNews;

import java.util.List;

public interface BusinessNewsService extends IService<BusinessNews> {
    List<BusinessNews> selectNews();

}
