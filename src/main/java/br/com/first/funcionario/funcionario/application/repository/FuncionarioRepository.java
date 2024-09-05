package br.com.first.funcionario.funcionario.application.repository;

import br.com.first.funcionario.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	Funcionario salva(Funcionario funcionario);
}
