package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades;

import java.util.ArrayList;
import java.util.List;

public class ItensPedido {
    private Integer quantidade;
    private Double preco;

    private List<Produto> produtos = new ArrayList<>();

    public ItensPedido(Produto produto1) {
    }

    public ItensPedido(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "ItensPedido{" +
                "quantidade=" + quantidade +
                ", preco=" + preco +
                ", produtos=" + produtos +
                '}';
    }




}
