package com.udemy.cursojavacompletonelioalves.exercicios.ExerciciosSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args){
	  Locale.setDefault(Locale.US);
	  Scanner leitor = new Scanner(System.in);

	  double largura = leitor.nextDouble();
	  double comprimento = leitor.nextDouble();
	  double metroQuadrado = leitor.nextDouble();

	  double area = largura * comprimento;
	  double preco = area * metroQuadrado;

	  System.out.printf("Área = %.2f%n", area);
	  System.out.printf("Preço R$ %.2f%n", preco);
	  leitor.close();
  }
}