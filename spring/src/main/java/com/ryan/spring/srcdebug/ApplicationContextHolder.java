package com.ryan.spring.srcdebug;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/1/4 10:23
 * @des
 */
public class ApplicationContextHolder implements ApplicationContextAware {
    public static ApplicationContext applicationContext;


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}