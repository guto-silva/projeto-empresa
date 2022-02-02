package br.dev.guto.projetoempresa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_id", nullable = false)
	private Integer numeroId;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "andar", nullable = false)
	private Integer andar;

	public Integer getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(Integer numeroId) {
		this.numeroId = numeroId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}
	
}
