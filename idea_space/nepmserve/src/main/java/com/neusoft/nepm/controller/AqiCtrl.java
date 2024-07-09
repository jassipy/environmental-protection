package com.neusoft.nepm.controller;

import com.neusoft.nepm.service.AqiService;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/aqi")
public class AqiCtrl {
    @Resource
    private AqiService service;

    @GetMapping("/listAqiAll")
    public RespponseData getApi(){
        RespponseData data = service.getAqi();
        return data;
    }
}
