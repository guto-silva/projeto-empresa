package br.dev.guto.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.guto.projetoempresa.dao.ProjetoDao;
import br.dev.guto.projetoempresa.model.Projeto;

@RestController
public class ProjetoController {

	@Autowired
	ProjetoDao dao;
	
	@GetMapping("/projeto")
	public ArrayList<Projeto> recuperarProjeto(){
		return (ArrayList<Projeto>)dao.findAll();
	}
	
}
