package br.com.first.funcionario.funcionario.application.repository;

import java.util.List;

import br.com.first.funcionario.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	Funcionario salva(Funcionario funcionario);
	List<Funcionario> buscaTodos();
}