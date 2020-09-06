package com.huawei.module1.mapper;

import com.huawei.module1.model.MarketInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarketInfoMapper {
    /**
     * 查询所有的市场信息
     *
     * @param marketInfo marketInfo
     * @return List<MarketInfo>
     */
    List<MarketInfo> queryMarketInfo(MarketInfo marketInfo);
}
