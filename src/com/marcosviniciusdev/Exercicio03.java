package com.marcosviniciusdev;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o saldo: ");
		double saldo = sc.nextDouble();
		
		double saldoReajustavo = saldo - (saldo * .01);
		
		System.out.printf("\nR$%.2f reajustado a 1%% = R$%.2f", saldo, saldoReajustavo);
		
		sc.close();
	}
	
}
