package com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades.Conta;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades.ContaBusiness;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades.ContaPoupanca;

public class Program2 {
    public static void main(String[] args) {

        Conta acc1 = new Conta(1000,"Gustavo",100.00);
        acc1.saque(50.00);
        System.out.println(acc1.getSaldo());

        ContaPoupanca acc2 = new ContaPoupanca(1001,"Marcela",1100.00,0.02);
        acc2.saque(100.00);
        System.out.println(acc2.getSaldo());

        acc2.atualizarSaldo();
        System.out.println(acc2.getSaldo());

        ContaBusiness acc3 = new ContaBusiness(1002,"Maria",1000.00,500.00);
        acc3.saque(200);
        System.out.println(acc3.getSaldo());
        acc3.credito(600);
        System.out.println(acc3.getSaldo());

    }
}
