package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/21.
 */
public class Question023 {

    public static void main(String[] args) {
        try {
            String[] arr =new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";
            for (String var : arr) {
                System.out.print(var + " ");
            }
        } catch(Exception e) {
            System.out.print (e.getClass());
        }
    }

}
