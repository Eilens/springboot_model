/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: UserController
 * FileName: UserController
 * Author:   Eilen
 * Date:     2018/6/26 10:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.eilen.pojo.User;
import xin.eilen.service.UserService;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/26
 * @since 1.0.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/sec")
    public User select(long id){
        User user = service.selectUser(id);

        String s = JSON.toJSONString(user);
        return  user;
    }
    @GetMapping("/exce")
    public void excetp() throws Exception{
        System.out.println("出问题了");
        throw  new Exception();
    }
}
