/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: CatService
 * FileName: CatService
 * Author:   Eilen
 * Date:     2018/6/23 15:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.service;

import com.start.springbootstart.pojo.Cat;
import com.start.springbootstart.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
@Service
public class CatService {
    @Autowired
    private CatRepository repository;
    @Transactional
    public void save(Cat cat ){
        repository.save(cat);
    }
    @Transactional
    public void delete(int id){
        repository.deleteById(id);
    }
    public Iterable<Cat> getAll(){
        Iterable<Cat> all = repository.findAll();
        return all;
    }
}
