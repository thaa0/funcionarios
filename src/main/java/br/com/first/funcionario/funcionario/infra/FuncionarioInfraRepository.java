package br.com.first.funcionario.funcionario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.first.funcionario.funcionario.application.repository.FuncionarioRepository;
import br.com.first.funcionario.funcionario.domain.Funcionario;
import br.com.first.funcionario.funcionario.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
	private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

	@Override
	public Funcionario salva(Funcionario funcionario) {
		log.info("[inicia] FuncionarioIfraRepository - salva");
		funcionarioSpringDataJPARepository.save(funcionario);
		log.info("[finaliza] FuncionarioIfraRepository - salva");
		return funcionario;
	}

	@Override
	public List<Funcionario> buscaTodos() {
		log.info("[inicia] FuncionarioIfraRepository - buscaTodos");
		List<Funcionario> funcionarios = funcionarioSpringDataJPARepository.findAll();
		log.info("[finaliza] FuncionarioIfraRepository - buscaTodos");
		return funcionarios;
	}

	@Override
	public void busca(UUID idFuncionario) {
		log.info("[inicia] FuncionarioIfraRepository - buscaTodos");
		funcionarioSpringDataJPARepository.findById(idFuncionario);
		log.info("[finaliza] FuncionarioIfraRepository - buscaTodos");		
	}

	@Override
	public Funcionario buscaFuncionarioAtravesId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioIfraRepository - buscaFuncionarioAtravesId");
		Funcionario funcionario = funcionarioSpringDataJPARepository.findById(idFuncionario)
				.orElseThrow(()-> APIException.build(HttpStatus.NOT_FOUND, "Funcionario nao encontrado"));
		log.info("[finaliza] FuncionarioIfraRepository - buscaFuncionarioAtravesId");
		return funcionario;
	}

	@Override
	public void deletaAtravesId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioIfraRepository - deletaAtravesId");
		log.info("[finaliza] FuncionarioIfraRepository - deletaAtravesId");	
	}
}