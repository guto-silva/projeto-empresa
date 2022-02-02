package br.dev.guto.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.guto.projetoempresa.dao.FuncionarioDao;
import br.dev.guto.projetoempresa.model.Funcionario;

@RestController
public class FuncionarioController {
	
	@Autowired
	private FuncionarioDao dao;
	
	@GetMapping("/funcionarios")
	public ArrayList<Funcionario> recuperarTodosFuncionarios(){
		return (ArrayList<Funcionario>)dao.findAll();
	}
	
	@GetMapping("/funcionario")
	public Funcionario recuperarPorId() {
		return dao.findById(1).get();
	}
}
