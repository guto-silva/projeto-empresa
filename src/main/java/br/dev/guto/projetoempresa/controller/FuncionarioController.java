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
	FuncionarioDao dao;
	
	@GetMapping("/funcionario")
	public ArrayList<Funcionario> recuperarFuniconarios(){
		return (ArrayList<Funcionario>)dao.findAll();
	}
	
}
