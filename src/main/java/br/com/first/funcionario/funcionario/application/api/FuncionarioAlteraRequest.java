package br.com.first.funcionario.funcionario.application.api;

import lombok.Value;

@Value
public class FuncionarioAlteraRequest {
	private String nomeCompleto;
	private String cargo;
	private Double salario;
	private String telefone;
	private String endereco;
}
