package com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioFormas.entidades.enums.Cor;

import java.nio.charset.CoderResult;

public abstract class Forma {
    private Cor cor;

    public Forma(){

    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract Double area();


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.2f",area()));
        return sb.toString();
    }
}


