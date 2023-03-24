package com.udemy.cursojavacompletonelioalves.exercicios.exercicioArquivos;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioArquivos.entities.ProdutoArq;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8_MelhorandoAImplementacao {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        List<ProdutoArq> prods = new ArrayList<>();

        System.out.println("Informe o caminho do arquivo de origem: ");
        String caminhoOrigemStr = leitor.nextLine();

        Path origemArquivo = Paths.get(caminhoOrigemStr);
        Path origemPasta = origemArquivo.getParent();

        Path destinopasta = origemPasta.resolve("out");
        if (!Files.exists(destinopasta)) {
            Files.createDirectory(destinopasta);
            System.out.println("Pasta criada com sucesso");
        } else {
            System.out.println("A pasta de destino já existe");
        }


        Path destinoArquivo = destinopasta.resolve("sumario.csv");


        if (!Files.exists(origemArquivo)){
            System.out.println("O arquivo de origem não existe.");
            return;
        }

        try (BufferedReader br = Files.newBufferedReader(origemArquivo)){
            String itensCsv = br.readLine();

            while (itensCsv != null){
                String[] campos = itensCsv.split(",");
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                prods.add(new ProdutoArq(nome,preco,quantidade));
                itensCsv = br.readLine();
            }

            try (BufferedWriter bw = Files.newBufferedWriter(destinoArquivo, StandardOpenOption.TRUNCATE_EXISTING)){
                for (ProdutoArq prod : prods){
                    bw.write(prod.getNome() + "," + String.format("%.2f", prod.total()));
                    bw.newLine();
                }
                bw.flush();
                System.out.println("CRIADO");
            }
            catch (IOException e){
                System.out.println("Erro ao escrever arquivo.");
            }
        }
        catch (IOException e){
            System.out.println("Não foi possivel ler o arquivo." + e.getMessage());
        }



        leitor.close();

    }
}
