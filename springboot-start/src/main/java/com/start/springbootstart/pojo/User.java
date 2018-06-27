/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: User
 * FileName: User
 * Author:   Eilen
 * Date:     2018/6/25 17:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.pojo;

import javax.persistence.*;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
