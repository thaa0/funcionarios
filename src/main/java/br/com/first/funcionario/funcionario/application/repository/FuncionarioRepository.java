package br.com.first.funcionario.funcionario.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.first.funcionario.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	Funcionario salva(Funcionario funcionario);
	List<Funcionario> buscaTodos();
	void busca(UUID idFuncionario);
}