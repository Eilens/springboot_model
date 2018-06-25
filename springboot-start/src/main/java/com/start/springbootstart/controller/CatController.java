/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: CatController
 * FileName: CatController
 * Author:   Eilen
 * Date:     2018/6/23 15:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.controller;

import com.start.springbootstart.pojo.Cat;
import com.start.springbootstart.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
@RestController
@RequestMapping("/cat")
public class CatController {
    @Autowired
    private CatService service;
    @GetMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatAge(18);
        cat.setCatName("小名");
        service.save(cat);
        return "save end";
    }
    @GetMapping("/del")
    public String del(){
        service.delete(1);
        return "del od";
    }
    @GetMapping("/getAll")
    public Iterable<Cat> getAll(){
        return service.getAll();
    }
}
