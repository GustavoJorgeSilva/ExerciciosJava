package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double taxa;


    public double salarioLiquido() {
        return this.salarioBruto - taxa;
    }

    public void aumentoSalario(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem/100);
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                nome +
                String.format(" R$ %.2f", salarioLiquido());
    }
}
