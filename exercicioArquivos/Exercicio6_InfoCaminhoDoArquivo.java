package com.udemy.cursojavacompletonelioalves.exercicios.exercicioArquivos;

import java.io.File;
import java.util.Scanner;

public class Exercicio6_InfoCaminhoDoArquivo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String strPath = leitor.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());




        leitor.close();
    }
}
