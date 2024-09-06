package br.com.first.funcionario.funcionario.application.api;

import br.com.first.funcionario.funcionario.domain.Endereco;
import lombok.Value;

@Value
public class FuncionarioAlteraRequest {
	private String nomeCompleto;
	private String cargo;
	private Double salario;
	private String telefone;
	private Endereco endereco;
}
