package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces;

import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.TaxaDeJurosBrasil;
import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.TaxaDeJurosUsa;
import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.interfaces.ServicoJuros;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class DefaultMethods {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Valor: ");
            double valor = leitor.nextDouble();
            System.out.println("Meses: ");
            int meses = leitor.nextInt();

            ServicoJuros taxa = new TaxaDeJurosUsa(1.0);

            System.out.print("Pagamento apos " + meses + " meses e de : ");
            System.out.printf("%.2f", taxa.pagamento(valor, meses));

        } catch (InvalidParameterException e){
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
