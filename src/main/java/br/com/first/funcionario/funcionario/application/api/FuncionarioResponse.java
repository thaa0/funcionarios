package br.com.first.funcionario.funcionario.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class FuncionarioResponse {
	private UUID idFuncionario;
}