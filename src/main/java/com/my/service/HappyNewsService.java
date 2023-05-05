package com.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.pojo.HappyNews;
import com.my.pojo.RecommendNews;

import java.util.List;

public interface HappyNewsService extends IService<HappyNews> {
    List<HappyNews> selectNews();

}
