package com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades;

public class ContaBusiness extends Conta {

    private Double limiteCredito;


    public ContaBusiness() {
        super();
    }

    public ContaBusiness(Integer numeroConta, String titularConta, Double saldo, Double limiteCredito) {
        super(numeroConta, titularConta, saldo);
        this.limiteCredito = limiteCredito;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void credito(double valor) {
        if (valor <= limiteCredito) {
            saldo += valor - 10;
        } else {
            System.out.println("Valor acima do limite de credito disponivel");
        }
    }

    @Override
    public void saque(double valor){
        super.saque(valor);
        saldo -= 2.0;
    }
}
