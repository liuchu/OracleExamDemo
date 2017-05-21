package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/21.
 */
public class Question045 {

    void readCard(int num) throws Exception{
        System.out.println("Reading Card");
    }

    void checkCard(int num) throws RuntimeException{
        System.out.println("Checking Card");
    }

    public static void main(String[] args) throws Exception {
        Question045 question045 = new Question045();
        // No need to handle RuntimeException, but it's required to throws Non-RuntimeException
        question045.readCard(10);
        question045.checkCard(10);
    }
}
