package com.algaworks.algalog.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable // Indica que a classe pode ser usada como @Embedded em outra classe.
public class Destinatario {

	@NotBlank
	@Column(name = "destinatario_nome") // Customização do nome da coluna na tabela.
	private String nome;
	
	@NotBlank
	@Column(name = "destinatario_logradouro")
	private String logradouro;
	
	@NotBlank
	@Column(name = "destinatario_numero")
	private String numero;
	
	@NotBlank
	@Column(name = "destinatario_complemento")
	private String complemento;
	
	@NotBlank
	@Column(name = "destinatario_bairro")
	private String bairro;
	
}
