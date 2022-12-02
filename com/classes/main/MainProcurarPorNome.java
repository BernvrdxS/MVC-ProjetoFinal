package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainProcurarPorNome {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Claudia");
		pessoa = pessoaBO.procurarPorNome(pessoa);
		System.out.println(pessoa);
		
	}
}