package com.chuliu.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by chuliu on 2017/5/21.
 */
public class Question008 {


    public static void main(String[] args) {
        String date = LocalDate.parse("2015-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }


}
