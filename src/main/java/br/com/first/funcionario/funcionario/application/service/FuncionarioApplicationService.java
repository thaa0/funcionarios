package br.com.first.funcionario.funcionario.application.service;

import org.springframework.stereotype.Service;

import br.com.first.funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.funcionario.application.api.FuncionarioResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class FuncionarioApplicationService implements FuncionarioService {

	@Override
	public FuncionarioResponse cadastraFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioApplicationService - cadastraFuncionario");
		log.info("[finaliza] FuncionarioApplicationService - cadastraFuncionario");
		return null;
	}
}