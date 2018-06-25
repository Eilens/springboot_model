/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DemoMapper
 * FileName: DemoMapper
 * Author:   Eilen
 * Date:     2018/6/23 16:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.jdbcRepository;

import com.start.springbootstart.pojo.Cat;
import com.start.springbootstart.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
@Repository
public class DemoMapper {
    @Autowired
    private JdbcTemplate template;
    public Demo getById(Long id){
        String sql = "select * from Demo where id = ?";
        BeanPropertyRowMapper<Demo> rowMapper = new BeanPropertyRowMapper<>(Demo.class);
        Demo demo = template.queryForObject(sql, rowMapper, id);
        return  demo;
    }
}
