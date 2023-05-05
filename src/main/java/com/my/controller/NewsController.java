package com.my.controller;


import com.my.pojo.*;
import com.my.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private RecommendNewsService recommendNewsService;
    @Autowired
    private ScienceNewsService scienceNewsService;
    @Autowired
    private HealthNewsService healthNewsService;
    @Autowired
    private BusinessNewsService businessNewsService;
    @Autowired
    private HappyNewsService happyNewsService;
    @Autowired
    private SportsNewsService sportsNewsService;


    @GetMapping("/recommend")
    List<RecommendNews> selectNews() {
        return recommendNewsService.selectNews();
    }
    @GetMapping("/science")
    List<ScienceNews> selectScience() {
        return scienceNewsService.selectNews();
    }
    @GetMapping("/health")
    List<HealthNews> selectHealth() {
        return healthNewsService.selectNews();
    }
    @GetMapping("/business")
    List<BusinessNews> selectBusiness() {
        return businessNewsService.selectNews();
    }
    @GetMapping("/happy")
    List<HappyNews> selectHappy() {
        return happyNewsService.selectNews();
    }
    @GetMapping("/sports")
    List<SportsNews> selectSports() {
        return sportsNewsService.selectNews();
    }

}
