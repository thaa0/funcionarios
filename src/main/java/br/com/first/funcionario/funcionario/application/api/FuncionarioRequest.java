package br.com.first.funcionario.funcionario.application.api;

import javax.validation.Valid;

import lombok.Value;

@Value
@Valid
public class FuncionarioRequest {
	private String nomeCompleto;
	private String profissao;
	private Double salario;
	private String telefone;
	private String endereco;
}