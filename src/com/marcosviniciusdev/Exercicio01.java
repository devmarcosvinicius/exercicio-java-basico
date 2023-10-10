package com.marcosviniciusdev;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anos: ");
		int idadeAnos = sc.nextInt();
		
		System.out.println("Meses: ");
		int idadeMeses = sc.nextInt();
		
		System.out.println("Dias: ");
		int idadeDias = sc.nextInt();
		
		int totalDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
		
		System.out.println("Sua idade em dias: " + totalDias);
		
		sc.close();
		
	}

}
