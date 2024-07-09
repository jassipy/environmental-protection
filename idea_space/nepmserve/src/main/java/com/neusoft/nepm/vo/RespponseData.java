package com.neusoft.nepm.vo;

import lombok.Data;

@Data
//泛型
public class RespponseData<T> {
    private Integer code;//响应码
    private String message;//相应信息

    private T resulte;//响应数据 未来数据库里查询的数据
}
