package br.dev.guto.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.guto.projetoempresa.dao.DepartamentoDao;
import br.dev.guto.projetoempresa.model.Departamento;

@RestController
public class DepartamentoController {
	
	@Autowired
	DepartamentoDao dao;
	
	@GetMapping("/departamento")
	public ArrayList<Departamento> recuperarDepartamentos(){
		return (ArrayList<Departamento>)dao.findAll();
	}
	
}
