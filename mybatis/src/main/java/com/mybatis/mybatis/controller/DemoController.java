/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DemoController
 * FileName: DemoController
 * Author:   Eilen
 * Date:     2018/6/25 9:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.mybatis.mybatis.controller;

import com.github.pagehelper.PageHelper;
import com.mybatis.mybatis.pojo.Demo;
import com.mybatis.mybatis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService service;

    @RequestMapping("/likeName")
    public List<Demo> like(String name) {
        PageHelper.startPage(0,2);
        return service.likeName(name);
    }
    @GetMapping("/a")
    public String aa(){
        return "afq";
    }

    @GetMapping("/save")
    public Demo save(String name){
        System.out.println(name);
        return service.save(name);
    }
}
