package com.marcosviniciusdev;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a porcetagem do IPI a ser acrescido: ");
		int ipi = sc.nextInt();
		
		Peca peca1 = new Peca();
		
		System.out.println("Digite o codigo da peça: ");
		peca1.setCodigo(sc.nextInt());
		
		System.out.println("Digite o valor da peça");
		peca1.setValorUnitario(sc.nextDouble());
		
		System.out.println("Digite a quantidade de peças: ");
		peca1.setQuantidade(sc.nextInt());
		
		Peca peca2 = new Peca();
		
		System.out.println("Digite o codigo da peça: ");
		peca2.setCodigo(sc.nextInt());
		
		System.out.println("Digite o valor da peça");
		peca2.setValorUnitario(sc.nextDouble());
		
		System.out.println("Digite a quantidade de peças: ");
		peca2.setQuantidade(sc.nextInt());
		
		double valorFinal = ((peca1.getValorUnitario() * peca1.getQuantidade()) + (peca2.getValorUnitario() * peca2.getQuantidade()) * (ipi / 100 + 1));
		
		System.out.printf("\nValor final R$%.2f", valorFinal);
		
		sc.close();
	}

}
