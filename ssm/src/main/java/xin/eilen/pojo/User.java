/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: User
 * FileName: User
 * Author:   Eilen
 * Date:     2018/6/26 10:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.pojo;

import lombok.Data;

import javax.annotation.security.DenyAll;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/26
 * @since 1.0.0
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
}
