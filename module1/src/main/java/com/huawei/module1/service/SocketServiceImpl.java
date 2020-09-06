package com.huawei.module1.service;

import com.huawei.module1.manager.SocketCode;
import com.huawei.module1.mapper.SocketMapper;
import com.huawei.module1.model.Socket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Controller
@Slf4j
@RequestMapping("/socket")
public class SocketServiceImpl {

    @Autowired
    private SocketMapper socketMapper;

    @Autowired
    private SocketCode socketCode;

    /**
     * 获取所有的股票信息
     *
     * 深圳 sz 000001-001000,001696-003816,300001-300892
     *
     * 上海 sh 600000-605399,688001-688981
     *
     * @return String
     */

    @RequestMapping(value = "/query/name",method = RequestMethod.GET)
    public String queryName(@RequestParam int scnumber,String market) {

        List<Socket> socketList =socketCode.getSocketInfo(scnumber,market);
        for (Socket socket:socketList){
            socketMapper.insert(socket);
        }
        log.info("Success to query {} socket number {} ,{} info inserted into DB ",market,scnumber,socketList.size());
        return "success";
    }

    /**
     * 获取过去20天股票5min级别价格详细信息的接口
     */
    @RequestMapping(value = "/query/fiveMin/20day")
    public String queryPriceByDay(){

        return null;
    }


}
