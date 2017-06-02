package com.chuliu.test;

/**
 * Created by chuliu on 2017/6/2.
 */
public class Question021 {

    public void doPrint() throws Exception{
        throw new RuntimeException("Runtime exception");
    }

    public void doList()throws Exception{
        throw new Error("Error");
    }

    public static void main(String[] args) {
        Question021 question021 = new Question021();

        try {
            question021.doPrint();
            question021.doList();
        } catch (Exception e) {
            System.out.println("Caught "+e);
        }
        System.out.println("Last line");

    }
}
