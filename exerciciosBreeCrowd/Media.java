package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosBreeCrowd;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        String notasLinha = sc.nextLine();


        String[] notasStr = notasLinha.split(" ");
        double n1 = Double.parseDouble(notasStr[0]);
        double n2 = Double.parseDouble(notasStr[1]);
        double n3 = Double.parseDouble(notasStr[2]);
        double n4 = Double.parseDouble(notasStr[3]);


        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10.0;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media <= 6.9){
            double notaExame = Double.parseDouble(sc.nextLine());
            double novaMedia = (media + notaExame) / 2.0;
            if (novaMedia >= 5.0) {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f\n", notaExame);
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", novaMedia);
            } else {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f\n", notaExame);
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", novaMedia);
            }

        }

        sc.close();
    }
}

