package com.udemy.cursojavacompletonelioalves.exercicios.exercicioPost;

import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPost.entidades.Comentario;
import com.udemy.cursojavacompletonelioalves.exercicios.exercicioPost.entidades.Post;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario comentario1 = new Comentario("Viagem incrivel");
        Comentario comentario2 = new Comentario("APROVEITE MUUUUITO");

        Post post = new Post(sdf.parse("28/12/2021 13:05:54"),"Viagem para ilha bela","Lugar incrivel para se conhecer"
        ,12);

        post.adicionarComentario(comentario1);
        post.adicionarComentario(comentario2);

        System.out.println(post);









    }
}
