package com.udemy.cursojavacompletonelioalves.exercicios.exercicio_pedidos.entidades;

import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date aniversario;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", aniversario=" + aniversario +
                '}';
    }
}
