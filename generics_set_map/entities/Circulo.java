package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities;

public class Circulo implements Shape {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
