package br.com.first.funcionario.funcionario.domain;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.first.funcionario.funcionario.application.api.FuncionarioAlteraRequest;
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
	@Column(columnDefinition = "uuid",name="id", updatable = false, unique = true,nullable = false)
	private UUID idFuncionario;
	@NotBlank(message="o campo nao pode estar em branco")
	private String nomeCompleto;
	@NotBlank
	private String cargo;
	@NotNull
	private Double salario;
	@NotBlank
	private String telefone;
	@NotNull
	@Embedded
	private Endereco endereco;
	
	//Constructor
	public Funcionario(FuncionarioRequest funcionarioRequest) {
		this.nomeCompleto = funcionarioRequest.getNomeCompleto();
		this.cargo = funcionarioRequest.getCargo();
		this.salario = funcionarioRequest.getSalario();
		this.telefone = funcionarioRequest.getTelefone();
		this.endereco = funcionarioRequest.getEndereco();
	}
	//constructor alteracao
	public void altera(@Valid FuncionarioAlteraRequest funcionarioAlteracaoRequest) {
		this.nomeCompleto = funcionarioAlteracaoRequest.getNomeCompleto();
		this.cargo = funcionarioAlteracaoRequest.getCargo();
		this.salario = funcionarioAlteracaoRequest.getSalario();
		this.telefone = funcionarioAlteracaoRequest.getTelefone();
		this.endereco = funcionarioAlteracaoRequest.getEndereco();		
	}
}