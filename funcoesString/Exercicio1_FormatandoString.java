package com.udemy.cursojavacompletonelioalves.exercicios.funcoesString;

public class Exercicio1_FormatandoString {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();//Elimina os espaços no canto da String
        String s04 = original.substring(2); //Define o valor de s04 partir do index desejado: cde FGHIJ abc DEFG
        String s05 = original.substring(2,9);//Define o valor de s05 do indice 2 ate o 9: -cde FGH-
        String s06 = original.replace('a','x'); //Troca o primeiro argumento pelo segundo
        String s07 = original.replace("abc","xy"); //O replace funciona como um SubSTring
        int i = original.indexOf("bc"); //Define o valor de i para o valor do indice onde se encontra "bc"
        int j = original.lastIndexOf("bc");





        System.out.println("Original: -"+original+"-");
        System.out.println("toLowerCase: -"+s01+"-");
        System.out.println("toUpperCase: -"+s02+"-");
        System.out.println("Trim: -"+s03+"-");
        System.out.println("SubString -"+s04+"-");
        System.out.println("SubString -"+s05+"-");
        System.out.println("Replace -"+s06+"-");
        System.out.println("Replace -"+s07+"-");
        System.out.println("Index of 'bc': "+i);
        System.out.println("Last index of 'bc': "+j);


    }
}
