package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades;

public class Produto {

    private String nome;
    private Double precoProduto;



    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.precoProduto = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return precoProduto;
    }

    public void setPreco(Double preco) {
        this.precoProduto = preco;
    }

}
