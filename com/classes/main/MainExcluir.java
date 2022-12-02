package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainExcluir {

	public static void main(String[] args) {

		// Teste Excluir
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Lucas");
		if (pessoaBO.excluir(pessoa))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
	}

}
