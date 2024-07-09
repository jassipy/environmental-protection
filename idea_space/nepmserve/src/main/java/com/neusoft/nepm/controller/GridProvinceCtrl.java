package com.neusoft.nepm.controller;

import com.neusoft.nepm.po.GridProvince;
import com.neusoft.nepm.service.GridProvinceService;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/gridprovince")
public class GridProvinceCtrl {
        @Resource
        private GridProvinceService service;

        @GetMapping("/getGridProvinces")
        public RespponseData getGridProvinces() {
            RespponseData data = service.getGridProvinces();
            return data;
        }

}
