package com.neusoft.nepm.service;

import com.neusoft.nepm.mapper.SupervisorMapper;
import com.neusoft.nepm.po.Supervisor;
import com.neusoft.nepm.utils.StringUtils;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公共监督员的servic层
 * 1.实例化注解
 * 2.注入对应的Mapper对象
 */
@Service
public class SupervisorService {
    // @Autowired
    @Resource
    private SupervisorMapper mapper;

    public RespponseData getSupervisorByIdByPass(String telId,String password){
        //调用mapper层的登陆方法
        Supervisor supervisor =mapper.getSupervisorByIdByPass(telId,password);
        //创建对象
        RespponseData data =new RespponseData();
        if(supervisor==null){
            //失败
            data.setCode(100);
            data.setMessage("用户名或密码不正确");
        }else{
            //成功
            data.setCode(200);
            data.setMessage("成功");
            data.setResulte(supervisor);
        }
        return data;
    }

    @Resource
    private StringUtils stringUtils;
    public RespponseData insertSupervisor(Supervisor supervisor){
        RespponseData data=new RespponseData();
        if(supervisor==null){
            //数据异常
            data.setCode(100);
            data.setMessage("参数异常");
            return data;
        }
        //supervistor!=null
        if(stringUtils.isEmpty(supervisor.getTelId())||!stringUtils.isRealPhone(supervisor.getTelId())){
            data.setCode(110);
            data.setMessage("手机号格式错误");
            return data;
        }
        //密码为空或密码错误
        if(stringUtils.isEmpty(supervisor.getPassword())||!stringUtils.isRealPassword(supervisor.getPassword())){
            data.setCode(120);
            data.setMessage("密码格式错误");
            return data;
        }
        int i= mapper.insert(supervisor);

        if(i==0){
            data.setCode(150);
            data.setMessage("已被注册 失败");
            return data;
        }else{
            data.setCode(200);
            data.setMessage("增加用户成功");
        }
        return data;

    }
    public RespponseData getSupervisorById(String telId){
        RespponseData data=new RespponseData();
        if(telId==null){
            //数据异常
            data.setCode(100);
            data.setMessage("参数异常");
            return data;
        }
        //supervistor!=null
        if(stringUtils.isEmpty(telId)||!stringUtils.isRealPhone(telId)){
            data.setCode(110);
            data.setMessage("手机号格式错误");
            return data;
        }
       Supervisor supervisor=mapper.selectById(telId);
        if(supervisor!=null){
            data.setCode(150);
            data.setMessage("手机已被注册");
            return data;
        }else{
            data.setCode(200);
            data.setMessage("手机未被注册");
        }
        return data;

    }

}
