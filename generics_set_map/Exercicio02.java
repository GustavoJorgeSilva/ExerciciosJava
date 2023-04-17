package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map;

import com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities.Produto;
import com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.services.ServicoDeCalculo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) throws FileNotFoundException {

//        Scanner leitor = new Scanner(System.in);

        List<Produto> numeros = new ArrayList<>();

        String path = "C:\\Users\\gusta\\Desktop\\teste.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));


        try {
            String linha = br.readLine();
            while (linha != null) {
                String[] campos = linha.split(",");
                numeros.add(new Produto(campos[0],Double.parseDouble(campos[1])));
                linha = br.readLine();
            }

            Produto x = ServicoDeCalculo.maior(numeros);
            System.out.println("Produto de maior valor: ");
            System.out.println(x);






        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
