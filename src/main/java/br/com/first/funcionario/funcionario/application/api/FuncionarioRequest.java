package br.com.first.funcionario.funcionario.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class FuncionarioRequest {
	@NotBlank(message="o campo nao pode estar em branco")
	private String nomeCompleto;
	@NotBlank
	private String profissao;
	@NotNull
	private Double salario;
	@NotBlank
	private String telefone;
	@NotBlank
	private String endereco;
}