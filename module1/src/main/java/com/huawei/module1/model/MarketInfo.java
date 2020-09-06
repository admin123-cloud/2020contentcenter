package com.huawei.module1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarketInfo {

    private String market;

    @ApiModelProperty("代码开始")
    private String rangestart;

    @ApiModelProperty("代码结束")
    private String rangeend;

    private int scnumber;
}
