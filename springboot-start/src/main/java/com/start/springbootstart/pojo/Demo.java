/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: Demo
 * FileName: Demo
 * Author:   Eilen
 * Date:     2018/6/23 11:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
public class Demo {
    private int id;
    private String name;
    @JSONField(format = "yyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(serialize = true)
    private String remarks;

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Demo() {
    }

    public Demo(int id, String name, Date createTime, String remarks) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.remarks = remarks;
    }
}
