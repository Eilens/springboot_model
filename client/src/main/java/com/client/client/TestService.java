/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: TestService
 * FileName: TestService
 * Author:   Eilen
 * Date:     2018/6/25 15:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.client.client;

import com.api.api.pojo.EchoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@Component
public class TestService {
    @Reference
    public EchoService echoService;
}
