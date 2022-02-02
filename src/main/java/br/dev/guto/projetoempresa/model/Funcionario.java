package br.dev.guto.projetoempresa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@ManyToOne
	@JoinColumn(name = "numero_id")
	@JsonIgnoreProperties("listaFuncionarios")
	private Departamento numeroDepartamento;
	

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

	public Departamento getNumeroDepartamento() {
		return numeroDepartamento;
	}

	public void setNumeroDepartamento(Departamento numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}
		
}
