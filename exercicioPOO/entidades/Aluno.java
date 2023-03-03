package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

public class Aluno {

    public String nome;
    public double nota1Trimestre;
    public double nota2Trimestre;
    public double nota3Trimestre;

    public Aluno(){

    }


    public Aluno(String nome, double nota1Trimestre, double nota2Trimestre, double nota3Trimestre) {
        this.nome = nome;
        this.nota1Trimestre = nota1Trimestre;
        this.nota2Trimestre = nota2Trimestre;
        this.nota3Trimestre = nota3Trimestre;
    }

    public Aluno(String nome, double nota1Trimestre, double nota2Trimestre) {
        this.nome = nome;
        this.nota1Trimestre = nota1Trimestre;
        this.nota2Trimestre = nota2Trimestre;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1Trimestre() {
        return nota1Trimestre;
    }

    public void setNota1Trimestre(double nota1Trimestre) {
        this.nota1Trimestre = nota1Trimestre;
    }

    public double getNota2Trimestre() {
        return nota2Trimestre;
    }

    public void setNota2Trimestre(double nota2Trimestre) {
        this.nota2Trimestre = nota2Trimestre;
    }

    public double getNota3Trimestre() {
        return nota3Trimestre;
    }

    public void setNota3Trimestre(double nota3Trimestre) {
        this.nota3Trimestre = nota3Trimestre;
    }

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
