package com.udemy.cursojavacompletonelioalves.exercicios.exercicioArquivos;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioArquivos.entities.ProdutoArq;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7_SummaryCSV {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        List<ProdutoArq> produtos = new ArrayList<>(); // cria uma lista de produtos

        System.out.println("Informe o caminho do arquivo: ");
        String strFileSource = leitor.nextLine(); // le o caminho do arquivo

        File sourceFile = new File(strFileSource); // Guarda o caminho do arquivo numa variavel FILE
        String sourceFolderStr = sourceFile.getParent(); // Retorna o caminho do arquivo "Desprezando o nome"

        boolean success = new File(sourceFolderStr + "\\out").mkdir(); // cria uma subpasta a partir do ca,imho do arquivo

        System.out.println("Pasta criada: " + success);

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; // comando que guarda numa variavel do tipo string a juncao do caminho do arquivo de origem mais o comando para criar o arquivo desejado

        try (BufferedReader br = new BufferedReader(new FileReader(strFileSource))) {
            String itemCsv = br.readLine(); // Comando para o Buffered ler o arquivo e armazenar na variavel itemCsv

            while (itemCsv != null) {
                String[] fields = itemCsv.split(","); // comando para separar as informações lidas da linha com uma virgula e guarda-las num array
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                produtos.add(new ProdutoArq(nome, preco, quantidade)); // Comando para instanciar um novo produto na lista com base nas informações lidas no arquivo
                itemCsv = br.readLine(); // comando para ler a proxima linha
            }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) { // comandos para criar um arquivo com base no caminho escolhido mais acima no targetFileStr
            for(ProdutoArq itens : produtos){ // for each para percorrer a lista de produtos
                bw.write(itens.getNome() + "," + String.format("%.2f ", itens.total())); // comando para escrever uma linha com o nome do produto e o valor total com o metodo de soma da quantidade * preco
                bw.newLine(); // comando pra iniciar uma nova linha ja que o buffered não da quabra de linha automatica
            }
            System.out.println(targetFileStr + " CRIADO");
        }
        catch (IOException e){
            System.out.println("Erro ao escrever arquivo: " + e.getMessage()); // Tratamento de excessoes
        }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }


    }
}
