package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exercicio3_Conv_HorarioGlobalParaHorarioLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-04-16");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-16T01:16:24");
        Instant d06 = Instant.parse("2023-04-16T01:16:24Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // convertendo o d06 para o horario do meu sistema
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2); // Horario Portugal
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4); // Horario Portugal

        System.out.println("d04 Dia = " + d04.getDayOfMonth());
        System.out.println("d04 Mes = " + d04.getMonth());
        System.out.println("d04 Mes(valor) = " + d04.getMonthValue());
        System.out.println("d04 Ano = " + d04.getYear());
        System.out.println("d04 DiaDoAno = " + d04.getDayOfYear());

        System.out.println("d05 Hora = " + d05.getHour());
        System.out.println("d05 Minut0 = " + d05.getMinute());
        System.out.println("d05 Segundo = " + d05.getSecond());
    }
}
