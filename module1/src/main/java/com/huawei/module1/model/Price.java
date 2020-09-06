package com.huawei.module1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 股票基本价格模型
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Price {

    @NotNull
    @ApiModelProperty("证券股票代码")
    private String codeId;

    @ApiModelProperty("证券股票名称")
    private String codeName;

    @ApiModelProperty("开盘价")
    private String open;

    @ApiModelProperty("收盘价")
    private String end;

    @ApiModelProperty("最高价")
    private String hight;

    @ApiModelProperty("最低价")
    private String low;

    @ApiModelProperty("成交量")
    private String volume;

    @ApiModelProperty("成交额-万")
    private String turnover;

    @ApiModelProperty("时间戳")
    private String timestamp;
}
