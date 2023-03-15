package com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades.enums.Cor;

public class Circulo extends Forma{

    private Double raio;

    public Circulo() {
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * raio * raio;
    }





}
