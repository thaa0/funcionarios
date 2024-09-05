package br.com.first.funcionario.funcionario.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.first.funcionario.funcionario.application.repository.FuncionarioRepository;
import br.com.first.funcionario.funcionario.domain.Funcionario;
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
}