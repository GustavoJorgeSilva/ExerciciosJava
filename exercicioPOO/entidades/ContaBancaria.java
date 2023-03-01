package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

public class ContaBancaria {

    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo;


    public ContaBancaria(){

    }
    public ContaBancaria(String numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        deposito(depositoInicial);
    }

    public ContaBancaria(String numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }


    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void saque(double valorSaque){
       this.saldo -= (valorSaque + 5.00);
    }

    public double verificarSaldo(){
      return this.saldo;
    }

    @Override
    public String toString() {
        return "Numero da conta = "
                + numeroDaConta
                + ", Nome do titular = "
                + nomeDoTitular +
                String.format(" Saldo = R$ %.2f ",saldo);
    }
}
