package com.ryan.spring.srcdebug;

import org.springframework.stereotype.Service;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/1/4 10:24
 * @des
 */

@Service("userService")
public class UserService {

    public void sayHello(String name){
        System.out.println("hello!,"+name);
    }
}