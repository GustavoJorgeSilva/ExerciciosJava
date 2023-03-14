package com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades;

public final class ContaPoupanca extends Conta{

    private double taxaDeJuros;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numeroConta, String titularConta, Double saldo, double taxaDeJuros) {
        super(numeroConta, titularConta, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaDeJuros;
    }

    @Override
    public final void saque(double valor) {
        saldo -= valor;
    }
}
