package br.com.first.funcionario.funcionario.infra;

import org.springframework.stereotype.Repository;

import br.com.first.funcionario.funcionario.application.repository.FuncionarioRepository;
import br.com.first.funcionario.funcionario.domain.Funcionario;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class FuncionarioInfraRepository implements FuncionarioRepository {

	@Override
	public Funcionario salva(Funcionario funcionario) {
		log.info("[inicia] FuncionarioIfraRepository - salva");
		log.info("[finaliza] FuncionarioIfraRepository - salva");
		return funcionario;
	}

}
