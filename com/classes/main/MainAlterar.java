package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Teste Alterar
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(2, "Claudia");
		pessoaBO.alterar(pessoa);
		pessoa = pessoaBO.procurarPorNome(pessoa);
		System.out.println(pessoa);
	}

}
