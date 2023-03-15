package com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades.Circulo;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades.Forma;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades.Retangulo;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades.enums.Cor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Forma> formas = new ArrayList<>();

        System.out.print("Informe o numero de formas: ");
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Forma #%d ", i + 1);
            System.out.print("Retangulo ou circulo? (r/c): ");
            char forma = in.readLine().charAt(0);
            System.out.print("Cor: (PRETO/AZUL/VERMELHO)");
            Cor cor = Cor.valueOf(in.readLine().toUpperCase());
            if (forma == 'r' || forma == 'R'){
                System.out.print("Largura: ");
                Double largura = Double.parseDouble(in.readLine());
                System.out.print("Altura: ");
                Double altura = Double.parseDouble(in.readLine());
                formas.add(new Retangulo(cor,altura,largura));
            } else if (forma == 'c' || forma == 'C') {
                System.out.print("Raio:");
                Double raio = Double.parseDouble(in.readLine());
                formas.add(new Circulo(cor,raio));
            }
        }

        System.out.println();
        System.out.println("Area das formas");
        for(Forma forma : formas){
            System.out.println(String.format("%.2f",forma.area()));
        }

    }
}
