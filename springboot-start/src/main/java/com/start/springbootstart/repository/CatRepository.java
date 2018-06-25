/**
 * Copyright (C), 2013-2018, 中商惠民科技有限公司
 * FileName: CatRepository
 * Author:   Eilen
 * Date:     2018/6/23 15:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 */
package com.start.springbootstart.repository;

import com.start.springbootstart.pojo.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * 〈discripe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
