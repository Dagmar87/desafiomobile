package com.dagmar.desafiomobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "nota")
public class Nota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "titulo", nullable = false, length = 255)
	@NotNull(message = "Titulo é Obrigatório")
	@Length(max = 255, min = 3, message = "O titulo deve conter entre 3 e 255 caracteres")
	private String titulo;
	
	@Column(name = "texto", nullable = false, length = 1000)
	@NotNull(message = "Texto é Obrigatório")
	@Length(max = 1000, min = 3, message = "O texto deve conter entre 3 e 255 caracteres")
	private String texto;

}
