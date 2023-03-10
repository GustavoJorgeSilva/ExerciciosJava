package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercicio2_DateToString {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-04-16");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-16T08:16:24");
        Instant d06 = Instant.parse("2023-04-16T08:16:24Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt01));
        System.out.println("d04 = " + fmt01.format(d04));

        System.out.println("d05 formato1 = " + d05.format(fmt01));
        System.out.println("d05 formato2 = " + d05.format(fmt02));
        System.out.println("d05 formato4 = " + d05.format(fmt04));

        System.out.println("d06 = " + fmt03.format(d06));
        System.out.println("d06 formato4 = " + fmt05.format(d06));
        System.out.println("d06 toString = " + d06.toString());
    }
}
