/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: MyBatisPageHelper
 * FileName: MyBatisPageHelper
 * Author:   Eilen
 * Date:     2018/6/23 18:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.mybatis.mybatis.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
@Configuration
public class MyBatisPageHelper {
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        pageHelper.setProperties(properties);
        return  pageHelper;
    }
}
