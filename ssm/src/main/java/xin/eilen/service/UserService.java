/**
 * Copyright (C), 2013-2018, 中商惠民科技有限公司
 * FileName: UserService
 * Author:   Eilen
 * Date:     2018/6/26 10:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 */
package xin.eilen.service;

import xin.eilen.pojo.User;

/**
 * 〈discripe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/26
 * @since 1.0.0
 */
public interface UserService {
    User selectUser(long id);
}
