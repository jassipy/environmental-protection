package com.neusoft.nepm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.nepm.po.Supervisor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SupervisorMapper extends BaseMapper<Supervisor> {

    //登录 注入
    @Select("select *\n" +
            "from supervisor\n" +
            "where tel_id=#{telId} and password=#{password} ")
    public Supervisor getSupervisorByIdByPass(String telId,String password);


}
