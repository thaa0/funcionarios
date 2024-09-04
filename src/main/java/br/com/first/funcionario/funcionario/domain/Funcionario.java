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
	@NotBlank(message= "O campo nome não pode estar em branco")
	private String nomeCompleto;
	@NotBlank(message= "O campo nome não pode estar em branco")
	private String profissao;
	@NotBlank(message= "O campo salário não pode estar em branco")
	private Double salario;
	@NotBlank(message= "O campo telefone não pode estar em branco")
	private String telefone;
	@NotBlank(message= "O campo endereço não pode estar em branco")
	private String endereco;
	
	//Constructor
	public Funcionario(@NotBlank(message = "O campo nome não pode estar em branco") String nomeCompleto,
			@NotBlank(message = "O campo nome não pode estar em branco") String profissao,
			@NotBlank(message = "O campo salário não pode estar em branco") Double salario,
			@NotBlank(message = "O campo telefone não pode estar em branco") String telefone,
			@NotBlank(message = "O campo endereço não pode estar em branco") String endereco) {
		this.nomeCompleto = nomeCompleto;
		this.profissao = profissao;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
	}
}