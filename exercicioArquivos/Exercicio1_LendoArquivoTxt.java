package com.udemy.cursojavacompletonelioalves.exercicios.exercicioArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1_LendoArquivoTxt {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\gusta\\Desktop\\teste.txt");
        Scanner leitor = null;

        try{
            leitor = new Scanner(file);
            while (leitor.hasNextLine()){
                System.out.println(leitor.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (leitor != null) {
                leitor.close(); // É uma boa prática colocar o fechamento de recurso dentro do bloco finally
            }
        }

    }
}
