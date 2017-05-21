package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/21.
 */
public class Question028 {

    public static void main(String[] args) {
        String stringA = "A ";
        stringA = stringA.concat("B ");
        System.out.println(stringA);

        String stringB = "C ";
        stringA = stringA.concat(stringB);
        System.out.println(stringA);

        //Note, replace method will return a new String Object, the old String Object will NOT change
        stringA.replace('C','D');
        //stringA.replace("C","D");
        System.out.println(stringA);

        stringA = stringA.concat(stringB);
        System.out.println(stringA);

    }
}
