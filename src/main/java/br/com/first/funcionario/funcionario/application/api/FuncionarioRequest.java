package br.com.first.funcionario.funcionario.application.api;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.first.funcionario.funcionario.domain.Endereco;
import lombok.Value;

@Value
public class FuncionarioRequest {
	@NotBlank(message="o campo nao pode estar em branco")
	private String nomeCompleto;
	@NotBlank
	private String cargo;
	@NotNull
	private Double salario;
	@NotBlank
	private String telefone;
	@Valid
	private Endereco endereco;
}