package com.neusoft.nepm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.nepm.po.GridProvince;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GridProvinceMapper extends BaseMapper<GridProvince> {
    @Select("select * from grid_province")
    public List<GridProvince> getGridProvinces();

}