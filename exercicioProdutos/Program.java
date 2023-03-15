package com.udemy.cursojavacompletonelioalves.exercicios.exercicioProdutos;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioProdutos.entidades.Produto;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioProdutos.entidades.ProdutoImportado;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioProdutos.entidades.ProdutoUsado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos: ");
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Produto #%d\n", i + 1);
            System.out.print("Comum, usado ou importado? (c,u,i): ");
            char tipoProduto = in.readLine().charAt(0);
            System.out.print("Nome: ");
            String nomeProduto = in.readLine();
            System.out.print("Preco: " );
            double preco = Double.parseDouble(in.readLine());
            if (tipoProduto == 'c' || tipoProduto == 'C'){
                produtos.add(new Produto(nomeProduto,preco));
            } else if (tipoProduto == 'u' || tipoProduto == 'U') {
                System.out.print("Data de fabricacao: ");
                String dataFabricacaoStr = in.readLine();
                Date dataFabricacao = sdf.parse(dataFabricacaoStr);
                produtos.add(new ProdutoUsado(nomeProduto,preco,dataFabricacao));
            } else if (tipoProduto == 'i' || tipoProduto == 'I') {
                System.out.print("Taxa de alfandega: ");
                double taxaAlfandega = Double.parseDouble(in.readLine());
                produtos.add(new ProdutoImportado(nomeProduto,preco,taxaAlfandega));
            }
        }

        System.out.println("Etiquetas de preco:");
        for (Produto prod : produtos){
            System.out.println(prod.etiqueta());
        }
    }
}
