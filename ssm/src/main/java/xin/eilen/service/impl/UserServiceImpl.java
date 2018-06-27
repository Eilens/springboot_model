/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: UserServiceImpl
 * FileName: UserServiceImpl
 * Author:   Eilen
 * Date:     2018/6/26 10:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.eilen.mapper.UserMapper;
import xin.eilen.pojo.User;
import xin.eilen.service.UserService;

import javax.enterprise.inject.TransientReference;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/26
 * @since 1.0.0
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    @Override
    public User selectUser(long id) {
        return mapper.selectUser(id);
    }
}
