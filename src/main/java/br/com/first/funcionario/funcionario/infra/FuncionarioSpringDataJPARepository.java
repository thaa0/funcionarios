package br.com.first.funcionario.funcionario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.first.funcionario.funcionario.domain.Funcionario;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {

}
