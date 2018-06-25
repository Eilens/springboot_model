/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: GlobalDefaultExceptionHandler
 * FileName: GlobalDefaultExceptionHandler
 * Author:   Eilen
 * Date:     2018/6/23 16:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/23
 * @since 1.0.0
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest request,Exception e){

    }
}
