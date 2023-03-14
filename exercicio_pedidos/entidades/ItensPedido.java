package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades;

import java.util.ArrayList;
import java.util.List;

public class ItensPedido {
    private Integer quantidade;
    private Double preco;

    private Produto produto;

    public ItensPedido(){

    }

    public ItensPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal(){
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return produto.getNome() + " R$" +
                String.format("%.2f",preco) +
                " Quantidade: " + quantidade + " SubTotal R$ "+
                String.format("%.2f",subTotal());
    }
}
