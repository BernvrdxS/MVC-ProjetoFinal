package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainInserir {

	public static void main(String[] args) {
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Kauã", 18);
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Bernardo", 19);
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Lucas", 21);
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}

}
