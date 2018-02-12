package com.ryan.spring.srcdebug;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/1/3 14:07
 * @des
 */

@Service("test")
public class SayService {

    @PostConstruct
    public void init(){
        System.out.println("构造函数后执行");
    }


    public void say(){
        System.out.println("I am Spring");
    }
}