package com.huawei.module1.mapper;

import com.huawei.module1.model.Price;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceMapper {

    /**
     * 插入多条股票价格
     *
     * @param prices prices
     * @return int
     */
    int addPriceList(List<Price> prices);

    /**
     * 插入单条股票价格
     *
     * @param price price
     * @return int
     */
    int addPriceModel(Price price);
}
