package com.ryan.spring.srcdebug;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/1/3 14:08
 * @des
 */
public class SpringIoCTest {
    @Test
    public void test1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        SayService sayService = (SayService)applicationContext.getBean("test");
        sayService.say();


//        UserService userService =(UserService)ApplicationContextHolder.applicationContext.getBean("userService");
//        userService.sayHello("tom");
    }

}