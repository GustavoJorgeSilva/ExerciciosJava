package com.udemy.cursojavacompletonelioalves.exercicios.exerciciosEnum;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Pedido;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.enums.StatusDePedido;

import java.util.Date;
import java.util.Scanner;

public class Exercicio1_Pedido {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Pedido pedido = new Pedido(1080, new Date(), StatusDePedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        StatusDePedido sp1 = StatusDePedido.ENTREGUE;

        StatusDePedido sp2 = StatusDePedido.valueOf("ENTREGUE");

        System.out.println(sp1);
        System.out.println(sp2);





    }
}
