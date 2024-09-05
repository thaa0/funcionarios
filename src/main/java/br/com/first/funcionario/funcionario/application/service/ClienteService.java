package br.com.first.funcionario.funcionario.application.service;

import org.springframework.stereotype.Service;

import br.com.first.funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.funcionario.application.api.FuncionarioResponse;

@Service
public interface ClienteService {
	FuncionarioResponse cadastraFuncionario(FuncionarioRequest funcionarioRequest);
}