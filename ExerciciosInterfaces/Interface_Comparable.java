package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces;

import com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosInterfaces.model.entidades.Funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Interface_Comparable {
    public static void main(String[] args) {


        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\Users\\gusta\\Desktop\\teste.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null) {
                String[] campos = funcionarioCsv.split(",");
                list.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
                funcionarioCsv = br.readLine();
            }
            Collections.sort(list);
            for (Funcionario f : list) {
                System.out.println(f.getNome() + "," + f.getSalario());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}




