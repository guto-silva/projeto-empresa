package br.dev.guto.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.dev.guto.projetoempresa.model.Departamento;

public interface DepartamentoDao extends CrudRepository<Departamento, Integer>{
		
}
