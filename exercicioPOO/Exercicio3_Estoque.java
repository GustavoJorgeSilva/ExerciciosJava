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
        System.out.print("Quantidade existente em estoque: " );
        produto.quantidade = leitor.nextInt();
        System.out.println("");

        System.out.println(produto.nome+" R$ "+ produto.preco
            +" Qntd :"+produto.quantidade+ " Valor total estoque: R$ "+ produto.valorTotalEstoque());


        System.out.println("Digite quantos produtos deseja adicionar: ");
        int entrada = leitor.nextInt();
        produto.adicionarProdutos(entrada);

        System.out.println("Quantidade atualizada: ");
        System.out.println(produto.nome+" R$ "+ produto.preco
                +" Qntd :"+produto.quantidade+ " Valor total estoque: R$ "+ produto.valorTotalEstoque());



        System.out.println("Digite a quntidade de produtos que deseja retirar: ");
        int retirada = leitor.nextInt();
        produto.removerProdutos(retirada);


        System.out.println("Quantidade atualizada: ");
        System.out.println(produto);


    }
}
