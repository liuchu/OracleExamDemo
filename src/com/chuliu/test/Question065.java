package com.chuliu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by chuliu on 2017/6/2.
 */
public class Question065 {

    public static void main(String[] args) {
        List objs = new ArrayList();
        Contract c1 = new Super();
        Contract c2 = new Sub();
        Super s = new Sub();

        objs.add(c1);
        objs.add(c2);
        objs.add(s);

        for (Object item:objs){

            System.out.println(item.getClass().getName());
        }
    }
}

interface Contract{}
class Super implements Contract{}
class Sub extends Super{}
