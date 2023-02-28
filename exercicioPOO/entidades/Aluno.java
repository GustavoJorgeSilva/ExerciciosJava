package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

public class Aluno {

    public String nome;
    public double nota1Trimestre;
    public double nota2Trimestre;
    public double nota3Trimestre;


    public double notaFinal() {
        return nota1Trimestre + nota2Trimestre + nota3Trimestre;
    }

    public double pontosRestantes() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }

    public String verificarNotaFinal(double value) {
        if (notaFinal() < 60) {
            return "\nNAO PASSOU" + "\n" + String.format("Pontos Restantes: %.2f", pontosRestantes());

        } else {
            return "PASSOU";
        }

    }

    @Override
    public String toString() {
        return "Nome do aluno: "
                + nome + "\n"+
                "Nota final: " + notaFinal()+"\n"+
                verificarNotaFinal(notaFinal());
    }
}
