package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/28.
 */
public class Question100 {

    public void main(){

    }

    public static void main(String[] args) {
        int[] array;

        array = new int[2];
        array[0] = 10;
        array[1] = 20;

        array = new int[4];
        array[2] = 30;
        array[3] = 40;

        for (int item:array
             ) {
            System.out.println(item);
        }


    }
}
