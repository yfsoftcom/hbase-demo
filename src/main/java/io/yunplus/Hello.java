package io.yunplus;

public class Hello {
    public String sayHello(String name){
        return "Hello "+name+"!";
    }

    public static void main(String[] args){
        System.out.println(new Hello().sayHello("hbase"));
    }
}