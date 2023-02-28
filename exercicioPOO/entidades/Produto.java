package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;


    public double valorTotalEstoque(){
        return  quantidade * preco;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto - " +
                "Nome: '" + nome + '\'' +
                String.format(", R$ %.2f",preco) +
                ", Quantidade: " + quantidade +" unidades"+
                ", Valor total em estoque: " + String.format("R$ %.2f", valorTotalEstoque());
    }
}
