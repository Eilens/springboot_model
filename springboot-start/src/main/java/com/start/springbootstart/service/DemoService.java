/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DemoService
 * FileName: DemoService
 * Author:   Eilen
 * Date:     2018/6/23 16:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.service;

import com.start.springbootstart.jdbcRepository.DemoMapper;
import com.start.springbootstart.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper mapper;
    public void save(Long id   ){
        mapper.getById(id);
    }
}
