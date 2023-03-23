package com.udemy.cursojavacompletonelioalves.exercicios.exercicioArquivos;

import java.io.File;
import java.util.Scanner;

public class Exercicio5_ManipulandoPastasComFile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o caminho da pasta: ");
        String pathStr = leitor.nextLine();

        File path = new File(pathStr);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);
        }

        boolean success = new File(pathStr + "\\pastaTeste").mkdir();
        System.out.println("Diretorio criado com sucesso: " + success);


        leitor.close();

    }
}
