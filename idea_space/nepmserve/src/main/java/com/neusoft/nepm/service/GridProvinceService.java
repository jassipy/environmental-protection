package com.neusoft.nepm.service;

import com.neusoft.nepm.mapper.GridProvinceMapper;
import com.neusoft.nepm.po.GridProvince;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class GridProvinceService {

    @Resource
    private GridProvinceMapper mapper;

    public RespponseData getGridProvinces(){
        List<GridProvince> list =mapper.getGridProvinces();
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
