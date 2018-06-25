/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: ThymeleafTemplateController
 * FileName: ThymeleafTemplateController
 * Author:   Eilen
 * Date:     2018/6/23 16:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
//在使用thymeleaf模版的时候不能使用restcontroller 只能使用controller
@Controller
@RequestMapping("/templates")
public class ThymeleafTemplateController {
    @RequestMapping("/html")
    public String helloHtml(Map<String ,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return "hello";
    }
}
