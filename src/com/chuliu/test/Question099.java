package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/28.
 */
public class Question099 {

    static void displayResult(int[] list){
        try {
            System.out.println(list[1] / (list[1] - list[2]));
        }catch (ArithmeticException e1){
            System.err.println("First Exception");
        }
        System.out.println("Done");

    }

    public static void main(String[] args) {
        try {
            int[] arr = {100, 100};
            displayResult(arr);
        }catch (IllegalArgumentException e2){
            System.err.println("Second Exception");
        }catch (Exception e3){
            System.out.println("Third Exception");
        }
    }
}
