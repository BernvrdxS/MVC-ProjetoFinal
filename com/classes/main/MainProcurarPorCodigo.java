package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {

		PessoaBO pessoaBO = new PessoaBO();
		Pessoa codigo = new Pessoa(5);
		codigo = pessoaBO.procurarPorCodigo(codigo);
		System.out.println(codigo);
		

	}
}