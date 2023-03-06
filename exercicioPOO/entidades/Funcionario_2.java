package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

public class Funcionario_2 {

    public Integer id;

    public String nome;

    private Double salario;


    public Funcionario_2(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "Id:" + id +
                ", Nome do funcionario: " + nome  +
                ", Salario:" + salario;
    }


    public void aumentoSalario(double porcentagem){
       this.salario += salario * (porcentagem / 100);

    }




}
