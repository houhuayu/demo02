package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWord {
    public static void main(String[] args) {
       // HelloWord helloword = new HelloWord();
      //  helloword.setName("zhangsan");
        //helloword.hello();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloWord helloWord = (HelloWord) applicationContext.getBean("helloWord");
        HelloWord helloWord = applicationContext.getBean(HelloWord.class);
        helloWord.hello();


    }
}
