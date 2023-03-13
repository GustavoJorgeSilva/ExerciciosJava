package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.enums.StatusDePedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date moment;
    private StatusDePedido status;

    private List<ItensPedido> itensPedidos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(Date moment, StatusDePedido status) {
        this.moment = moment;
        this.status = status;
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

    public List<ItensPedido> getItensPedidos() {
        return itensPedidos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarItem(ItensPedido itensPedido){
        itensPedidos.add(itensPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "moment=" + moment +
                ", status=" + status +
                ", itensPedidos=" + itensPedidos +
                ", clientes=" + clientes +
                '}';
    }






}


