package com.geng.controller;

public class HelloWorld {
    public String name;

    public void setName(String name){
        this.name= name;
    }

    public void hello(){
        System.out.print("HELLO "+name);
    }
}
