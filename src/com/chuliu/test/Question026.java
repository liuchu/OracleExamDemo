package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/21.
 */
public class Question026 {

    public static void main(String[] args) {
        int[] array = {1,2,3};

        for (int var:array) {
            int i = 1;
            while (i<=var){
                System.out.println(i++);
            }
        }
    }
}
