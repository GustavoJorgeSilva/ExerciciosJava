package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades.enums.Hierarquia;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FuncionarioTech {

    private String nome;
    private Hierarquia nivelTrabalho;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHoras> contratos = new ArrayList<>();

    public FuncionarioTech() {
    }

    public FuncionarioTech(String nome, Hierarquia nivelTrabalho, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivelTrabalho = nivelTrabalho;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hierarquia getNivelTrabalho() {
        return nivelTrabalho;
    }

    public void setNivelTrabalho(Hierarquia nivelTrabalho) {
        this.nivelTrabalho = nivelTrabalho;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHoras> getContratos() {
        return contratos;
    }

    public void adicionarContrato(ContratoHoras contrato){
        contratos.add(contrato);
    }

    public void removerContrato (ContratoHoras contrato){
        contratos.remove(contrato);
    }

    public double income (int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoHoras c : contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);

            if (ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }

}
