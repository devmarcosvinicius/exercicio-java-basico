package com.marcosviniciusdev;

public class Peca {
	
	private int codigo;
	private double valorUnitario;
	private int quantidade;
	
	
	
	public Peca() {}

	public Peca(int codigo, double valorUnitario, int quantidade) {
		super();
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
