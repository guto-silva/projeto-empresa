package br.dev.guto.projetoempresa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.dev.guto.projetoempresa.model.Departamento;

public interface DepartamentoDao extends CrudRepository<Departamento, Integer>{
		public List<Departamento> findByOrderByNome();
}
