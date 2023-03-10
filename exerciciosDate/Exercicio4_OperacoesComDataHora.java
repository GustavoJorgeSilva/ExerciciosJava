package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosDate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercicio4_OperacoesComDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-04-16");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-16T01:16:24");
        Instant d06 = Instant.parse("2023-04-16T01:16:24Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);


        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: "+ nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekLInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("pastWeekInstant: " + pastWeekLInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekLInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekLInstant);

        System.out.println("t1 Dias = " + t1.toDays());
        System.out.println("t2 Dias  = " + t2.toDays());
        System.out.println("t2 Horas = " + t2.toHours());
        System.out.println("t3 Dias = " + t3.toDays());
        System.out.println("t4 Dias = " + t4.toDays());



    }
}
