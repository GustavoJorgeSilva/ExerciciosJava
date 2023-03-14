package com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades;

public class Conta {

    private Integer numeroConta;
    private String titularConta;
    private Double saldo;

    public Conta(){

    }

    public Conta(Integer numeroConta, String titularConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Double getSaldo() {
        return saldo;
    }


    public void saque(double valor){
        saldo -= valor;
    }

    public void deposito(double valor){
        saldo += valor;
    }



}
