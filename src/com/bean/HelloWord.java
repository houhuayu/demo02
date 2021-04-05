package com.bean;

import lombok.Data;

@Data
public class HelloWord {
    private String name;

    public void setName2(String name) {
        System.out.println("set name in");
        this.name = name;
    }

    public HelloWord() {
        System.out.println("无参构造器in");
    }

    public HelloWord(String name) {
        System.out.println("有参构造器");
        this.name = name;
    }

    public void hello(){
        System.out.println("hello:"+name);
    }


}
