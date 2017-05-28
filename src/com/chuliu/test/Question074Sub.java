package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/28.
 */
public class Question074Sub extends Question074Super {

    private int s;

    public Question074Sub(){
        this(20);
    }

    public Question074Sub(int num){
        super();
        this.s = num;

    }

    public static void main(String[] args) {

        Question074Sub q = new Question074Sub();
        //System.out.println("x: "+q.x);
        System.out.println("y: "+q.y);
        //System.out.println("y: "+Question074Sub.a);
        System.out.println("y: "+Question074Sub.b);
    }

}
