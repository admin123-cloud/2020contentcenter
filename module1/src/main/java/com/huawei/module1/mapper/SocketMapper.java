package com.huawei.module1.mapper;

import com.huawei.module1.model.Socket;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SocketMapper {

    /**
     * 插入股票信息
     *
     * @param socket socket
     * @return int
     */
    int insert(Socket socket);

    /**
     *
     */
    List<Socket> queryAllSocket();
}
