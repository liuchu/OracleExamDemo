package com.chuliu.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by chuliu on 2017/6/2.
 */
public class TimeDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime  localTime = LocalTime.now();
        LocalTime localTimeCET = LocalTime.now(ZoneId.of("Europe/Paris"));
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Date:"+localDate.toString());
        System.out.println("Date after format:"+localDate.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println("Time:"+localTime.toString());
        System.out.println("CET Time:"+localTimeCET.toString());
        System.out.println("DateTime:"+localDateTime.toString());

        Instant timestamp = Instant.now();
        System.out.println("Current Timestamp = "+timestamp);
    }
}
