package com.neusoft.nepm.controller;

import com.neusoft.nepm.po.Supervisor;
import com.neusoft.nepm.service.SupervisorService;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 1.实例化 @RestController
 * 2.创建公共监督员统一请求路径
 * 3.注入对应的service对象 @Resource
 * 3.创建对应的请求功能
 *
 */
@RestController
@RequestMapping("/supervisor")
public class SupervisorCtrl {
    @Resource
    private SupervisorService service;
    @PostMapping("/getSupervisorByIdByPass")
    public RespponseData getSupervisorByIdByPass(@RequestBody Supervisor supervisor){
        RespponseData data =service.getSupervisorByIdByPass(supervisor.getTelId(),supervisor.getPassword());
        return data;
    }
    @PostMapping("/insertSupervisor")
    public RespponseData insertSupervisor(@RequestBody Supervisor supervisor){
        return service.insertSupervisor(supervisor);
    }
    @GetMapping("/getSupervisorById")
    public RespponseData getSupervisorById(String telId){
        return  service.getSupervisorById(telId);
    }
}
