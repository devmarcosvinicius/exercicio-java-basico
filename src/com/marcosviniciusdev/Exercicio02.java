package com.marcosviniciusdev;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int media1 = (4 + 8 + 9) / 3;
		int media2 = (4 + 5 + 6) / 3;
		
		int soma = media1 + media2;
		
		System.out.println(soma);
		
		sc.close();
	}

}
