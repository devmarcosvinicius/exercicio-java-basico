package com.marcosviniciusdev;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		
		System.out.printf("Sucessor: %d", sucessor);
		System.out.printf("\nNumero digitado: %d", numero);
		System.out.printf("\nAntecessor: %d", antecessor);
		
		sc.close();
		
	}

}
