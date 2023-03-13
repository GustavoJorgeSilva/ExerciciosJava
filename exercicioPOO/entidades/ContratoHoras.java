package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

import java.util.Date;

public class ContratoHoras {

    private Date data;

    private Double valorHora;
    private Integer horasTrabalhadas;


    public ContratoHoras() {
    }

    public ContratoHoras(Date data, Double valorHora, Integer horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horas;
    }

    public Date getData() {
        return data;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Integer getHoras() {
        return horasTrabalhadas;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public void setHoras(Integer horas) {
        this.horasTrabalhadas = horas;
    }

    @Override
    public String toString() {
        return "ContratoHoras{" +
                "data=" + data +
                ", valorHora=" + valorHora +
                ", horasTrabalhadas=" + horasTrabalhadas +
                '}';
    }

    public double valorTotal() {

        return valorHora * horasTrabalhadas;
    }
}
