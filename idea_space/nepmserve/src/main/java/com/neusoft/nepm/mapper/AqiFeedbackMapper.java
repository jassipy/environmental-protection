package com.neusoft.nepm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.nepm.po.AqiFeedback;

import java.util.List;


public interface AqiFeedbackMapper extends BaseMapper<AqiFeedback> {
    //根据手机号查询反馈列表

    public List<AqiFeedback> listAqiFeedbackByTelId(String telId);
}
