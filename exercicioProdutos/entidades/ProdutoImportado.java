package com.udemy.cursojavacompletonelioalves.exercicios.exercicioProdutos.entidades;

public class ProdutoImportado extends  Produto {

    private double taxaAlfandega;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, Double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public double precoTotal(){
        return getPreco() + taxaAlfandega;
    }

    @Override
    public String etiqueta() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(String.format(" %.2f (Taxa da alfandega R$ %.2f)",precoTotal(),taxaAlfandega));
        return sb.toString();
    }
}
