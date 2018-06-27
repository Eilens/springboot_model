/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: LoginController
 * FileName: LoginController
 * Author:   Eilen
 * Date:     2018/6/25 17:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.controller;

import com.start.springbootstart.pojo.User;
import org.hibernate.loader.plan.exec.process.spi.ReturnReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@Controller
public class LoginController {
    @GetMapping("/loginSuccess")
    String loginSuccess(){
        return "loginSuccess";
    }
    @GetMapping("/login")
    String login(Model model, User user ){
        model.addAttribute("user",user);
        return "index";
    }
}
