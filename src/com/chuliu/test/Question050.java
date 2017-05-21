package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/21.
 */
public class Question050 {

    public static void method(char cha){
        System.out.println("Print char");
    }

    public static void method(int in){
        System.out.println("Print int");
    }

    public static void main(String[] args) {
        int a = '8';
        char b = 8;

        method(a);

        method(b);
    }
}
