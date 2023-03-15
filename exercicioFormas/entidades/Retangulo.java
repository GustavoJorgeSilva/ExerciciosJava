package com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades.enums.Cor;

public class Retangulo extends Forma{

    private Double altura;
    private Double largura;

    public Retangulo() {
        super();
    }

    public Retangulo(Cor cor, Double altura, Double largura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public Double area() {
        return largura * altura;
    }


}
