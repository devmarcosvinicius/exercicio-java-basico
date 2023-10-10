package com.marcosviniciusdev;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario minimo: ");
		double salarioMinimo = sc.nextDouble(); 
		
		System.out.println("Digite o valor do seu salario: ");
		double salario = sc.nextDouble();
		
		double qtdSalarioMinimo = salario / salarioMinimo;
		
		System.out.printf("Você ganha %.2f salarios minimos.", qtdSalarioMinimo);
		
		sc.close();
	}

}
