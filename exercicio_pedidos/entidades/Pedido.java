package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.enums.StatusDePedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
    private Date moment;
    private StatusDePedido status;

    private Cliente cliente;
    private List<ItensPedido> itensPedidos = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(Date moment, StatusDePedido status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusDePedido getStatus() {
        return status;
    }

    public void setStatus(StatusDePedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void adicionarItem(ItensPedido itensPedido){
        itensPedidos.add(itensPedido);
    }

    public void removerItem(ItensPedido itensPedido){
        itensPedidos.remove(itensPedido);
    }

    public double total(){
        double soma = 0.0;
        for (ItensPedido item : itensPedidos){
            soma += item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hora do pedido: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens do pedido:\n ");
        for (ItensPedido item : itensPedidos){
            sb.append(item + "\n");
        }
        sb.append("Preço total: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}


