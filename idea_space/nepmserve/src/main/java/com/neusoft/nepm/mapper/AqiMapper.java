package com.neusoft.nepm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.nepm.po.Aqi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AqiMapper extends BaseMapper<Aqi> {

}
