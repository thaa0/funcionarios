package br.com.first.funcionario.funcionario.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.first.funcionario.funcionario.application.api.FuncionarioAlteraRequest;
import br.com.first.funcionario.funcionario.application.api.FuncionarioListResponse;
import br.com.first.funcionario.funcionario.application.api.FuncionarioRequest;
import br.com.first.funcionario.funcionario.application.api.FuncionarioResponse;
import br.com.first.funcionario.funcionario.application.repository.FuncionarioRepository;
import br.com.first.funcionario.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;

	@Override
	public FuncionarioResponse cadastraFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioApplicationService - cadastraFuncionario");
		Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
		log.info("[finaliza] FuncionarioApplicationService - cadastraFuncionario");
		return FuncionarioResponse.builder().
				idFuncionario(funcionario.getIdFuncionario())
				.build();
	}

	@Override
	public List<FuncionarioListResponse> buscaFuncionarios() {
		log.info("[inicia] FuncionarioApplicationService - buscaFuncionarios");
		List<Funcionario> funcionarios = funcionarioRepository.buscaTodos();
		log.info("[finaliza] FuncionarioApplicationService - buscaFuncionarios");		
		return FuncionarioListResponse.converte(funcionarios);
	}

	@Override
	public void buscaFuncionario(UUID idFuncionario) {
		log.info("[inicia] FuncionarioApplicationService - buscaFuncionario");
		funcionarioRepository.busca(idFuncionario);
		log.info("[finaliza] FuncionarioApplicationService - buscaFuncionario");				
	}

	@Override
	public void alteraFuncionario(@Valid FuncionarioAlteraRequest funcionarioAlteracaoRequest) {
		log.info("[inicia] FuncionarioApplicationService - alteraFuncionario");
		log.info("[finaliza] FuncionarioApplicationService - alteraFuncionario");					
	}
}