package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.enums.StatusDePedido;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades.Cliente;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades.ItensPedido;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades.Pedido;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades.Produto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Informe os dados do cliente:");
        System.out.print("Nome: ");
        String nome = in.readLine();
        System.out.print("Email: ");
        String email = in.readLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        Date nasc = sdf.parse(in.readLine());

        Cliente cliente = new Cliente(nome,email,nasc);

        System.out.println("Informe os dados do pedido: ");
        System.out.println("PAGAMENTO_PENDENTE / PROCESSANDO / ENVIADO / ENTREGUE");
        System.out.print("Status: ");
        StatusDePedido statusDePedido = StatusDePedido.valueOf(in.readLine().toUpperCase());

        Pedido pedido = new Pedido(new Date(),statusDePedido,cliente);

        System.out.println("Quantos itens tem o pedido?");
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite as informacoes do %do item: \n", i + 1);
            System.out.print("Nome do produto: ");
            String nomeProduto = in.readLine();
            System.out.print("Preco: ");
            double precoProduto = Double.parseDouble(in.readLine());

            Produto produto = new Produto(nomeProduto,precoProduto);

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(in.readLine());

            ItensPedido itensPedido = new ItensPedido(quantidade,precoProduto,produto);

            pedido.adicionarItem(itensPedido);

        }

        System.out.println("Sumario do pedido: ");
        System.out.println(pedido);




    }
}
