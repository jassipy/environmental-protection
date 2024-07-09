package com.neusoft.nepm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.nepm.po.GridCity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GridCityMapper extends BaseMapper<GridCity> {
    @Select("select * from grid_city where province_id=#{provinceId} ")
    public List<GridCity> getGridCity(Integer provinceId);
}
