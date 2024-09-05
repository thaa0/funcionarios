package br.com.first.funcionario.funcionario.application.api;

import br.com.first.funcionario.funcionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioDetalhadoResponse {
	private String nomeCompleto;
	private String cargo;
	private Double salario;
	private String telefone;
	private String endereco;

	//constructor
	public FuncionarioDetalhadoResponse(Funcionario funcionario) {
		this.nomeCompleto = funcionario.getNomeCompleto();
		this.cargo = funcionario.getCargo();
		this.salario = funcionario.getSalario();
		this.telefone = funcionario.getTelefone();
		this.endereco = funcionario.getEndereco();
	}
}