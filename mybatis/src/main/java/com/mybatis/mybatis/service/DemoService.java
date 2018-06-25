/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DemoService
 * FileName: DemoService
 * Author:   Eilen
 * Date:     2018/6/25 9:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.mybatis.mybatis.service;

import com.mybatis.mybatis.mapper.DemoMapper;
import com.mybatis.mybatis.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper mapper;
    public List<Demo> likeName(String name){
        return mapper.likeName(name);
    }
    @Transactional
    public Demo save(String name ){
        System.out.println("service"+name);
        Demo demo = new Demo();
        demo.setName(name);
         mapper.save(demo);
         return demo;
    }

}
