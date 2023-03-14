package com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades.Conta;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades.ContaBusiness;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioConta.entidades.ContaPoupanca;

public class Program extends Conta {
    public static void main(String[] args) {

        Conta acc = new Conta(1001,"Gustavo",0.0);
        ContaBusiness bacc = new ContaBusiness(1002,"Marcela",0.0,500.0);


        // Upcasting

        Conta acc1 = bacc;
        acc1.getSaldo();

        Conta acc2 = new ContaBusiness(1003,"Guilherme",0.0,400.0);

        Conta acc3 = new ContaPoupanca(1004,"Joao",0.0,0.01);
        acc3.deposito(50.0);

        // Downcasting

        ContaBusiness acc4 = (ContaBusiness) acc2;
        acc4.credito(100.0);

//        ContaBusiness acc5 = (ContaBusiness) acc3;

        if (acc3 instanceof ContaBusiness){
            ContaBusiness acc5 = (ContaBusiness) acc3;
            acc5.credito(200.0);
            System.out.printf("Empréstimo!");
        }

        if (acc3 instanceof ContaPoupanca){
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.atualizarSaldo();
            System.out.println("Atualizado!");

        }

        System.out.println(acc3.getSaldo());






    }
}
