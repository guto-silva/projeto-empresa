package br.dev.guto.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.dev.guto.projetoempresa.model.Funcionario;

public interface FuncionarioDao extends CrudRepository<Funcionario, Integer> {

}
