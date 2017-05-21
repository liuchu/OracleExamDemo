package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/21.
 */
public class Question009 {

    //Trinity operator-mul
    public static String getLevel(int score){
        return score>=90?"A":score>=80?"B":score>=60?"C":"D";
    }

    public static void main(String[] args) {
        System.out.println(getLevel(95));
        System.out.println(getLevel(85));
        System.out.println(getLevel(75));
        System.out.println(getLevel(55));
    }
}
