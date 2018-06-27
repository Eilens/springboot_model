/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: UserMapper
 * FileName: UserMapper
 * Author:   Eilen
 * Date:     2018/6/26 10:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.mapper;

import xin.eilen.pojo.User;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/26
 * @since 1.0.0
 */

public interface UserMapper {
    User selectUser(long id);
}
