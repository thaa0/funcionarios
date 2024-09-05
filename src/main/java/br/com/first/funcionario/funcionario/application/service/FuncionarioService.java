package br.com.first.funcionario.funcionario.application.service;

import br.com.first.funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
	FuncionarioResponse cadastraFuncionario(FuncionarioRequest funcionarioRequest);
}