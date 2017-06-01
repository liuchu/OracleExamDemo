package com.chuliu.lambda;

import java.util.function.Predicate;

/**
 * Created by chuliu on 2017/6/1.
 * To test interfaces located in java.util.function with Lambda expression
 */
public class TestJavaFunctions {

    //Test Predicate
    public static void testPredicate(){
        Predicate<Integer> predicate1 = (num) -> {return num > 0;};
        Predicate<Integer> predicate2 = (num) -> {return num < 10;};
        Predicate<Integer> predicate3 = (num) -> {return num < -10;};

        System.out.println("3>0?"+predicate1.test(3));
        System.out.println("3>0取反?"+predicate1.negate().test(3));
        System.out.println("3>0并且3<10?"+predicate1.and(predicate2).test(3));
        System.out.println("12>0并且12<10?"+predicate1.and(predicate2).test(12));
        System.out.println("-3>0或者-3<-10?"+predicate1.or(predicate3).test(-3));
        System.out.println("-12>0或者-12<-10?"+predicate1.or(predicate3).test(-12));
    }



    public static void main(String[] args) {
        testPredicate();
    }
}
