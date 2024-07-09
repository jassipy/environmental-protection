package com.neusoft.nepm.service;

import com.neusoft.nepm.mapper.GridCityMapper;
import com.neusoft.nepm.po.GridCity;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * City的servic层
 * 1.实例化注解
 * 2.注入对应的Mapper对象
 */
@Service
public class GridCityService {
    @Resource
    private GridCityMapper mapper;

    public RespponseData getGridCity(Integer provinceId){
        List<GridCity> list =mapper.getGridCity(provinceId);
        RespponseData data =new RespponseData();
        if(list==null){
            //失败
            data.setCode(100);
            data.setMessage("查找市失败");
        }else{
            //成功
            data.setCode(200);
            data.setMessage("成功");
            data.setResulte(list);
        }
        return data;
    }
}
