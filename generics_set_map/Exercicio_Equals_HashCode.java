package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map;

import com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities.Cliente;

public class Exercicio_Equals_HashCode {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Gustavo", "gustavo.jorge@hotmail.com.br");
        Cliente c2 = new Cliente("Gustavo", "gustavo.jorge@hotmail.com.br");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);


    }

}
