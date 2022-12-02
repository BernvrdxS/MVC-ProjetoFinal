package com.classes.DTO;


public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa(int idade) {
		setidade(idade);
	}
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setidade(idade);
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getidade() {
		return getidade();
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}
	
	
}
