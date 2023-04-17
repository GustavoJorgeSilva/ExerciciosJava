package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map;

import com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities.Circulo;
import com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities.Retangulo;
import com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Retangulo(3.0,2.0));
        myShapes.add(new Circulo(2.0));

        List<Circulo> myCirculos = new ArrayList<>();
        myCirculos.add(new Circulo(3.0));
        myCirculos.add((new Circulo(2.0)));

        System.out.println("Area total: " + areatotal(myShapes));


    }

    public static double areatotal(List<? extends Shape>  list){
        double soma = 0;

        for (Shape s : list){
            soma += s.area();
        }
        return  soma;
    }
}
