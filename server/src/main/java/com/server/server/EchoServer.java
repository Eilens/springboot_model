/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: EchoServer
 * FileName: EchoServer
 * Author:   Eilen
 * Date:     2018/6/25 14:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.server.server;

import com.api.api.pojo.EchoService;
import org.springframework.stereotype.Service;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@Service
public class EchoServer implements EchoService {
    @Override
    public String echo(String str) {
        System.out.println(str);
        return str;
    }
}
