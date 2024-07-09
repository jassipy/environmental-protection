package com.neusoft.nepm.po;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("aqi_feedback")
@Data
public class AqiFeedback {
    @TableId(value="af_id",type= IdType.AUTO)
    private Integer afId;
    private String telId;
    private Integer provinceId;
    private Integer cityId;
    private String address;
    private String information;
    private Integer estimatedGrade;
    private String afDate;
    private String afTime;
    private Integer gmId;
    private String assignDate;
    private String assignTime;
    private Integer state;
    private String remarks;

    //多对一
    //MP对于多表查询必须添加注解
    // 表示这不是数据库表中的字段，自动输出映射时忽略此字段
    @TableField(exist=false)
    private Supervisor supervisor;
    @TableField(exist=false)
    private GridProvince gridProvince;
    @TableField(exist=false)
    private GridCity gridCity;
    @TableField(exist=false)
    private Aqi aqi;

}
