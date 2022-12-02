package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		PessoaBO marcaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("LG");
		if (marcaBO.existe(pessoa))
			System.out.println("Pessoa Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}