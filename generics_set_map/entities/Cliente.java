package com.udemy.cursojavacompletonelioalves.exercicios.generics_set_map.entities;

import java.util.Objects;

public class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(getNome(), cliente.getNome()) && Objects.equals(getEmail(), cliente.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail());
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(nome + "\n");
        sb.append(email);


        return sb.toString();
    }

    // METODOS



}
