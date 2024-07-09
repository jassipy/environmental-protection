package com.neusoft.nepm.service;


import com.neusoft.nepm.mapper.AqiMapper;
import com.neusoft.nepm.po.Aqi;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AqiService {

    @Resource
    private AqiMapper mapper;

    public RespponseData getAqi(){
        List<Aqi> list = mapper.selectList(null);
        RespponseData data =new RespponseData();
        if(list==null){
            //失败
            data.setCode(100);
            data.setMessage("查找失败");
        }else{
            //成功
            data.setCode(200);
            data.setMessage("成功");
            data.setResulte(list);
        }
        return data;
    }
}
