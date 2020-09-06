package com.huawei.module1.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回值类
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResp {


    @ApiModelProperty("状态码")
    public int code;

    @ApiModelProperty("状态信息")
    public String msg;
}
