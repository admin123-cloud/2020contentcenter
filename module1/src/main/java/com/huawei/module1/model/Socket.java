package com.huawei.module1.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 股票代码基本信息
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Socket {

    @NotNull
    @ApiModelProperty("证券股票代码")
    private String codeId;

    @ApiModelProperty("证券股票名称")
    private String codeName;


    @ApiModelProperty("是否进入捕猎范围")
    private int appearance=0;

    @ApiModelProperty("所属证券市场")
    private String territory;

}
