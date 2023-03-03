package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPOO.entidades;

public class AluguelQuarto {

    public int quartos;
    public String nome;
    public String email;


    public AluguelQuarto(int quartos, String nome, String email) {
        this.quartos = quartos;
        this.nome = nome;
        this.email = email;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "Quarto: " + quartos +
                ", Nome: " + nome +
                ", Email: " + email;
    }
}

