package com.quartz.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 皇甫
 */
public class TestSpringQuartz {
    private ClassPathXmlApplicationContext applicationContext;
    @Before
    public void test(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
    }
    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(1000000);
    }

}
