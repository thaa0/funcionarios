package br.com.first.funcionario.funcionario.domain;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.com.first.funcionario.funcionario.application.api.FuncionarioRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idFuncionario;
	@NotBlank(message="o campo nao pode estar em branco")
	private String nomeCompleto;
	@NotBlank
	private String cargo;
	@NotBlank
	private Double salario;
	@NotBlank
	private String telefone;
	@NotBlank
	private String endereco;
	
	//Constructor
	public Funcionario(FuncionarioRequest funcionarioRequest) {
		this.nomeCompleto = funcionarioRequest.getNomeCompleto();
		this.cargo = funcionarioRequest.getCargo();
		this.salario = funcionarioRequest.getSalario();
		this.telefone = funcionarioRequest.getTelefone();
		this.endereco = funcionarioRequest.getEndereco();
	}
}