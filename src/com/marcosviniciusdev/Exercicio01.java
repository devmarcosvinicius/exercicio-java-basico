package com.marcosviniciusdev;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade\nanos: ");
		int idadeAnos = sc.nextInt();
		
		System.out.println("Meses: ");
		int idadeMeses = sc.nextInt();
		
		System.out.println("Dias: ");
		int idadeDias = sc.nextInt();
		
		int totalDias = idadeDias;
		totalDias = idadeDias + (idadeMeses * 31);
		
		sc.close();
		
	}

}
