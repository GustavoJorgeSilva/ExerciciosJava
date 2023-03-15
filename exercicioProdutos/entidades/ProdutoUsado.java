package com.udemy.cursojavacompletonelioalves.exercicios.exercicioProdutos.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends  Produto {
    final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeFabricação;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricação) {
        super(nome, preco);
        this.dataDeFabricação = dataDeFabricação;
    }

    @Override
    public String etiqueta() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" (used)");
        sb.append(String.format(" R$ %.2f ",getPreco()));
        sb.append(" (Data de fabricação: " + sdf.format(dataDeFabricação) + ")");
        return sb.toString();
    }
}
