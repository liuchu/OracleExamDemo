package com.chuliu.test;

import java.util.ArrayList;

/**
 * Created by chuliu on 2017/5/30.
 */
public class Question113 {

    public static void main(String[] args) {
        /*ArrayList arrayList = new ArrayList();

        try {
            while (true) {
                arrayList.add("New String");
            }
        }catch (Exception e){

            System.err.println("Caught exception");
        }*/


        //System.out.println("end");

        int[][] arr = new int[2][0];
        arr[0] = new int[3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1] = new int[4];
        arr[1][0] = 10;
        arr[1][1] = 20;
        arr[1][2] = 30;
        arr[1][3] = 40;

        System.out.println(arr);

        String a = null;
        char[] chars = {'J','a','v','a'};

        for (char ca:chars
             ) {
            a = a + ca;
        }

        System.out.println(a);

        "dsa".substring(1,2);

    }
}
