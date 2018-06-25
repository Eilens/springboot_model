/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: HelloController
 * FileName: HelloController
 * Author:   Eilen
 * Date:     2018/6/23 11:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.controller;

import com.start.springbootstart.pojo.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello-2018-12-11.v.0";
    }
    @GetMapping("/demo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(2);
        demo.setName("aa");
        demo.setCreateTime(new Date());
        demo.setRemarks("adfdsaf");
        return demo;
    }
}
