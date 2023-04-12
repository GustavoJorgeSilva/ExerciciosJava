package com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades;

public final class ContaPoupanca extends Conta{

    private double rendimento;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numeroConta, String titularConta, Double saldo, double rendimento) {
        super(numeroConta, titularConta, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void atualizarSaldo(){
        saldo += saldo * rendimento;
    }

    @Override
    public final void saque(double valor) {
        saldo -= valor;
    }
}
