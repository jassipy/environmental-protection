package com.neusoft.nepm.service;


import com.neusoft.nepm.utils.StringUtils;
import com.neusoft.nepm.mapper.AqiFeedbackMapper;
import com.neusoft.nepm.po.AqiFeedback;
import com.neusoft.nepm.vo.RespponseData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AqiFeedbackService {

    @Resource
    private AqiFeedbackMapper mapper;

    public RespponseData getAqiFeedback(AqiFeedback aqiFeedback){
        RespponseData data = new RespponseData();
        int i=mapper.insert(aqiFeedback);
        if(i==0){
            data.setCode(100);
            data.setMessage("新增空气质量失败");

        }else{
            data.setCode(200);
            data.setMessage("成功");
        }
        return data;
    }





      @Resource
      private StringUtils stringUtils;
          //根据手机查询反馈列表
      public RespponseData<List<AqiFeedback>> listAqiFeedbackByTelId(String telId) {
              RespponseData<List<AqiFeedback>> data=new RespponseData();
              System.out.println(telId);
              if(stringUtils.isEmpty(telId)|| !stringUtils.isRealPhone(telId)){
                  //数据异常
                  data.setCode(1001);
                  data.setMessage("手机号格式不正确");
                  return  data;
              }
              //业务查询
              List<AqiFeedback> list = mapper.listAqiFeedbackByTelId(telId);
              if(list==null){
                  //数据异常
                  data.setCode(1002);
                  data.setMessage("查无信息");
                  return  data;
              }
              //正常返回
              data.setCode(200);
              data.setMessage("成功");
             data.setResulte(list);
              return  data;

          }

}
