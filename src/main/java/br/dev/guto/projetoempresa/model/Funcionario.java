package br.dev.guto.projetoempresa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_funcional")
	private Integer numFuncional;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "email", nullable = false, unique = true, length = 100)
	private String email;
	
	@Column(name = "salario", nullable = false)
	private Double salario;
	
	@Column(name = "numero_id")
	private Integer numeroId;
	
	@Column(name = "numero_chefe")
	private Integer numeroChefe;

	public Integer getNumFuncional() {
		return numFuncional;
	}

	public void setNumFuncional(Integer numFuncional) {
		this.numFuncional = numFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(Integer numeroId) {
		this.numeroId = numeroId;
	}

	public Integer getNumeroChefe() {
		return numeroChefe;
	}

	public void setNumeroChefe(Integer numeroChefe) {
		this.numeroChefe = numeroChefe;
	}
		
}
