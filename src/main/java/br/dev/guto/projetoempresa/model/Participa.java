package br.dev.guto.projetoempresa.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participa")
public class Participa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_contrato", nullable = false)
	private Integer numContrato;
	
	@Column(name = "num_funcionario", nullable = false)
	private Integer numFuncionario;
	
	@Column(name = "codigo", nullable = false)
	private Integer codigo;
	
	@Column(name = "data_ini", nullable = false)
	private Date dataIni;
	
	@Column(name = "data_fim", nullable = false)
	private Date dataFim;

	public Integer getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}

	public Integer getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(Integer numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getDataIni() {
		return dataIni;
	}

	public void setDataIni(Date dataIni) {
		this.dataIni = dataIni;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}	
	
}
