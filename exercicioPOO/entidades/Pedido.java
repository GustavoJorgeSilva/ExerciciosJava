package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.enums.StatusDePedido;

import java.util.Date;

public class Pedido {

    private Integer id;
    private Date instant;
    private StatusDePedido status;

    public Pedido(){

    }

    public Pedido(Integer id, Date instant, StatusDePedido status) {
        this.id = id;
        this.instant = instant;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstant() {
        return instant;
    }

    public void setInstant(Date instant) {
        this.instant = instant;
    }

    public StatusDePedido getStatus() {
        return status;
    }

    public void setStatus(StatusDePedido status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", instant=" + instant +
                ", status=" + status +
                '}';
    }
}
