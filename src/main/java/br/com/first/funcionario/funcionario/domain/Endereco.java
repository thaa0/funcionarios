package br.com.first.funcionario.funcionario.domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Endereco {
	@NotBlank(message = "Este campo não pode estar em branco")
	private String rua;
	@NotBlank(message = "Este campo não pode estar em branco")
	private String bairro;
	@NotBlank(message = "Este campo não pode estar em branco")
    private String cidade;
	@NotBlank(message = "Este campo não pode estar em branco")
    private String estado;
	@NotBlank(message = "Este campo não pode estar em branco")
    private String cep;

    public Endereco(String rua, String bairro, String cidade, String estado, String cep) {
    	this.rua = rua;
    	this.bairro = bairro;
    	this.cidade = cidade;
    	this.estado = estado;
    	this.cep = cep;
    }
}