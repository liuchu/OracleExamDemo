package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/28.
 */
public class Question076 {
    static double area;
    int b=2;
    int h=3;

    public static void main(String[] args) {
        double p,b,h;
        if (area == 0){
            b = 3;
            h = 4;
            p = 0.5;
        }

        //在方法里面，局部变量在使用之前一定要初始化（赋初值），若没被使用，则没初始化也不会提示错误。
        //area = p * b * h;

    }
}
