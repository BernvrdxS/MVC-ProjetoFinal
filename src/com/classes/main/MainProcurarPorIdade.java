package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainProcurarPorIdade {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(20);
		pessoa = pessoaBO.procurarPorIdade(pessoa);
		System.out.println(pessoa);

	}
}