package br.com.first.funcionario.funcionario.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;
import br.com.first.funcionario.funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
	private final FuncionarioService funcionarioService;

	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		FuncionarioResponse funcionarioCadastrado = funcionarioService.cadastraFuncionario(funcionarioRequest);
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return funcionarioCadastrado;
	}

	@Override
	public List<FuncionarioListResponse> getFuncionarios() {
		log.info("[inicia] FuncionarioController - getFuncionarios");
		List<FuncionarioListResponse> funcionarios = funcionarioService.buscaFuncionarios();
		log.info("[finaliza] FuncionarioController - getFuncionarios");		
		return funcionarios;
	}

	@Override
	public void patchFuncionario(UUID idFuncionario, @Valid FuncionarioAlteraRequest funcionarioAlteracaoRequest) {
		log.info("[inicia] FuncionarioController - getFuncionarios");
		funcionarioService.buscaFuncionario(idFuncionario);
		funcionarioService.alteraFuncionario(funcionarioAlteracaoRequest);
		log.info("[finaliza] FuncionarioController - getFuncionarios");	
	}
}