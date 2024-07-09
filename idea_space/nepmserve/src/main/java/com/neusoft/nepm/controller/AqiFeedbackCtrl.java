package com.neusoft.nepm.controller;


import com.neusoft.nepm.po.AqiFeedback;
import com.neusoft.nepm.service.AqiFeedbackService;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/aqiFeedback")
public class AqiFeedbackCtrl {

    @Resource
    private AqiFeedbackService service;
    @PostMapping("/saveAqiFeedback")
    public RespponseData getAqiFeedback(@RequestBody AqiFeedback aqiFeedback){
        return service.getAqiFeedback(aqiFeedback);
    }
    @GetMapping("/listAqiFeedbackByTelId")
    public RespponseData<List<AqiFeedback>> listAqiFeedbackByTelId(String telId) {
        return service.listAqiFeedbackByTelId(telId);
    }
}
