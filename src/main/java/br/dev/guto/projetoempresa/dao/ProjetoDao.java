package br.dev.guto.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.dev.guto.projetoempresa.model.Projeto;

public interface ProjetoDao extends CrudRepository<Projeto, Integer> {

}
