package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosSequenciais;

import java.util.Locale;
import static java.util.Locale.US;

public class ExercicioFormatacaoCasasDecimais {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 28;
        int code = 5290;
        char gender = 'M';


        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234667;

        System.out.println("Products:");
        System.out.printf("%s which price is $ %.2f%n", product1, price1);
        System.out.printf("Record: %s years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("Measue with height decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(US);
        System.out.printf("US decimal point: %.2f", measure);
    }
}
