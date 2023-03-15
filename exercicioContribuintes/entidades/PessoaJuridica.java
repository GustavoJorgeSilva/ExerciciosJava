package com.udemy.cursojavacompletonelioalves.exercicios.exercicioContribuintes.entidades;

public class PessoaJuridica extends Contribuinte {


    private int numerosDeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numerosDeFuncionarios) {
        super(nome, rendaAnual);
        this.numerosDeFuncionarios = numerosDeFuncionarios;
    }

    public int getNumerosDeFuncionarios() {
        return numerosDeFuncionarios;
    }

    public void setNumerosDeFuncionarios(int numerosDeFuncionarios) {
        this.numerosDeFuncionarios = numerosDeFuncionarios;
    }

    @Override
    public Double taxa() {
        if (numerosDeFuncionarios > 10) {
           return  getRendaAnual() * 0.14;
        } else {
            return  getRendaAnual() - 0.16;
        }
    }
}
