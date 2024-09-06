package br.com.first.funcionario.funcionario.domain;

import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Endereco {
	private String rua;
	private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String bairro, String cidade, String estado, String cep) {
    	this.rua = rua;
    	this.bairro = bairro;
    	this.cidade = cidade;
    	this.estado = estado;
    	this.cep = cep;
    }
}