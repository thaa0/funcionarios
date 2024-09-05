package br.com.first.funcionario.funcionario.application.api;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.first.funcionario.funcionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioListResponse {

	private String nomeCompleto;
	private String cargo;
	private Double salario;
	private String telefone;
	private String endereco;
	
	//converte lista de funcionarios em lista do tipo listResponse
	public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
		if(funcionarios.isEmpty()) {
			return Collections.emptyList();
		}
		return funcionarios.stream()
				.map(FuncionarioListResponse::new)
				.collect(Collectors.toList());
	}
	
	//constructor
	public FuncionarioListResponse(Funcionario funcionario) {
		this.nomeCompleto = funcionario.getNomeCompleto();
		this.cargo = funcionario.getCargo();
		this.salario = funcionario.getSalario();
		this.telefone = funcionario.getTelefone();
		this.endereco = funcionario.getEndereco();
	}

	
	
}
