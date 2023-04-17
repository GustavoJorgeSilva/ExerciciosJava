package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities;

public class Produto implements Comparable<Produto>{

    private String nome;
    private Double preco;


    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome + ", ");
        sb.append(String.format("%.2f ", preco));


        return sb.toString();
    }

    @Override
    public int compareTo(Produto other) {
        return preco.compareTo(other.getPreco());
    }
}
