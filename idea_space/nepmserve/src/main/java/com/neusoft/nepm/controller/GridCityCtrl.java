package com.neusoft.nepm.controller;

import com.neusoft.nepm.po.GridCity;
import com.neusoft.nepm.service.GridCityService;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 1.实例化 @RestController
 * 2.创建统一请求路径
 * 3.注入对应的service对象 @Resource
 * 3.创建对应的请求功能
 *
 */
@RestController
@RequestMapping("/gridCity")
public class GridCityCtrl {
    @Resource
    private GridCityService service;

    @GetMapping("/listGridCityByProvinceId")
    public RespponseData getGridCity(Integer provinceId) {
        RespponseData data = service.getGridCity(provinceId);
        return data;
    }
}
