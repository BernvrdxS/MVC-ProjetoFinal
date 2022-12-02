package com.classes.DTO;


public class Pessoa {
	private String nome;
	private int idade;
	private int codigo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int codigo) {
		setCodigo(codigo);
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa(int codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public Pessoa(int codigo, String nome, int idade) {
		setNome(nome);
		setIdade(idade);
		setCodigo(codigo);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
