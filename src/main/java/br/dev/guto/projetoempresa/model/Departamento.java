package br.dev.guto.projetoempresa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@OneToMany(mappedBy = "numeroDepartamento", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("numeroDepartamento")
	private List<Funcionario> listaFuncionarios;

	public List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

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
