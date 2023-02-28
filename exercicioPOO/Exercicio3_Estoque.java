package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.Produto;

import java.util.Scanner;

public class Exercicio3_Estoque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Melhoria feita com o metodo construtor e os getters e setters

        System.out.println("Informe produto: ");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.print("Valor:");
        double preco = leitor.nextDouble();


        Produto produto = new Produto(nome, preco);
        System.out.println("Informações do produto: " + produto);

        produto.setNome("Computador");
        System.out.println("Nome atualizado: "+ produto.getNome());
        produto.setPreco(1200.00);
        System.out.println("Preço atualizado: "+ produto.getPreco());

        System.out.println();
        System.out.println("Entre com o numero de produtos que deseja adicionar ao estoque: ");
        int entrada = leitor.nextInt();
        produto.adicionarProdutos(entrada);

        System.out.println();
        System.out.println("Informações atualizadas: ");
        System.out.println(produto);

        System.out.println();
        System.out.println("Entre com o numero de produtos que deseja retirar do estoque:");
        int retirada = leitor.nextInt();
        produto.removerProdutos(retirada);


        System.out.println("Informações atualizadas: ");
        System.out.println(produto);


    }
}
