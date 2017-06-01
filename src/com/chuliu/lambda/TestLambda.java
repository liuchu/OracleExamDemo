package com.chuliu.lambda;

/**
 * Created by chuliu on 2017/6/1.
 */
public class TestLambda {

    public static void doLambdaA(MyInterfaceA a){
        a.methodA();
    }

    public static void doLambdaB(MyInterfaceB a){
        System.out.println(a.methodB());
    }

    public static void doLambdaC(MyInterfaceC a){
        System.out.println("Outcome:"+a.methodC(2,4));
    }

    public static void main(String[] args) {

        //No args, return void
        doLambdaA(() -> {});

        //No args, return String
        doLambdaB(() -> "LambdaB|Haha");

        //contain args, return String
        doLambdaC((int x, int y) -> {return "LambdaC|"+String.valueOf(x+y);});
        doLambdaC((int x, int y) -> {return "LambdaC|"+String.valueOf(x*y);});
        doLambdaC((int x, int y) -> {return "LambdaC|"+x+""+y;});

    }

}
