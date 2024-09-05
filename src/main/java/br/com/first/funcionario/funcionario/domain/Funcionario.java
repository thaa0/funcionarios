package br.com.first.funcionario.funcionario.domain;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

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
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String profissao;
	@NotBlank
	private Double salario;
	@NotBlank
	private String telefone;
	@NotBlank
	private String endereco;
	
	//Constructor
	public Funcionario(String nomeCompleto, String profissao, Double salario, String telefone, String endereco) {
		this.nomeCompleto = nomeCompleto;
		this.profissao = profissao;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
	}
}