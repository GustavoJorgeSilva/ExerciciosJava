package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosDate;

import javax.sound.sampled.FloatControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter fmt01 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-04-16");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-16T08:16:24");
        Instant d06 = Instant.parse("2023-04-16T08:16:24Z");
        Instant d07 = Instant.parse("2023-04-16T08:16:24-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt01);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt02);

        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(22,7, 20, 01,30);


        System.out.println("d01 " + d01);
        System.out.println("d02 " + d02);
        System.out.println("d03 "+ d03);
        System.out.println("d04 "+ d04);
        System.out.println("d05 "+ d05);
        System.out.println("d06 "+ d06);
        System.out.println("d07 "+ d07);
        System.out.println("d08 "+ d08);
        System.out.println("d09 "+ d09);
        System.out.println("d10 "+ d10);
        System.out.println("d11 "+ d11);


    }
}
