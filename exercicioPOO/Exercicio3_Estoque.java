package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Produto;

import java.util.Scanner;

public class Exercicio3_Estoque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Informe produto: ");
        System.out.print("Nome: ");
        produto.nome = leitor.nextLine();
        System.out.print("Valor:");
        produto.preco = leitor.nextInt();
        System.out.print("Entre com a quantidade existente em estoque: ");
        produto.quantidade = leitor.nextInt();
        System.out.println("Informações do produto: "+ produto);


        System.out.println("Entre com o numero de produtos que deseja adicionar ao estoque: ");
        int entrada = leitor.nextInt();
        produto.adicionarProdutos(entrada);

        System.out.println("Quantidade atualizada: ");
        System.out.println(produto);
        System.out.println("Entre com o numero de produtos que deseja retirar do estoque:");
        int retirada = leitor.nextInt();
        produto.removerProdutos(retirada);


        System.out.println("Quantidade atualizada: ");
        System.out.println(produto);


    }
}
