package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainInserir {

	public static void main(String[] args) {
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Pedro");
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Marcos");
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Luiz");
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}

}

