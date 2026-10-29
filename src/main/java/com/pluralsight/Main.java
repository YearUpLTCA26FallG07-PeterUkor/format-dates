package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create Date object
        LocalDate localDate = LocalDate.now();
        // create formatters
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // print date
        System.out.println(localDate.format(dateTimeFormatter1));
        System.out.println(localDate.format(dateTimeFormatter2));

        // create DateTime object
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");

        // create time zone object
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        System.out.println(localDateTime.format(dateTimeFormatter3));
        System.out.println(gmtTime.format(dateTimeFormatter4));

        // bonus Challenge
        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("H:mm");
        DateTimeFormatter dateTimeFormatter6 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println(localDateTime.format(dateTimeFormatter5) + " on " + localDateTime.format(dateTimeFormatter6));

    }
}