package com.udemy.cursojavacompletonelioalves.exercicios.exercicioEmpresa.entidades;

public class Funcionario {

    private String nome;
    private Integer horasTrabalhadas;
    private Double valorPorHora;

    public Funcionario(){

    }

    public Funcionario(String nome, Integer horasTrabalhadas, Double valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome + " - ");
        sb.append("R$ " + String.format("%.2f",pagamento()));
        return sb.toString();
    }
}
