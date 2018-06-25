/**
 * Copyright (C), 2013-2018, 中商惠民科技有限公司
 * FileName: DemoMapper
 * Author:   Eilen
 * Date:     2018/6/25 9:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 */
package com.mybatis.mybatis.mapper;

import com.mybatis.mybatis.pojo.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈discripe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@Repository
public interface DemoMapper {
    @Select("select * from Demo where name like \"%\"#{name}\"%\"")
    public List<Demo> likeName(String name);

    @Select("select * from Demo where id=#{id}")
    public Demo getById(long id);
    @Select("select name from Demo where id =#{id}")
    public String getNameById(long id);

    @Insert({"insert into Demo (name)values(#{name})"})
    @Options(useGeneratedKeys=true,keyProperty = "id",keyColumn = "id")
    public void save(Demo name);
}
