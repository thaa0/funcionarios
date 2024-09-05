package br.com.first.funcionario.funcionario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.first.funcionario.funcionario.application.api.FuncionarioListResponse;
import br.com.first.funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
	FuncionarioResponse cadastraFuncionario(FuncionarioRequest funcionarioRequest);
	List<FuncionarioListResponse> buscaFuncionarios();
	void buscaFuncionarioAtravesDoId(UUID idFuncionario);
}