package br.dev.guto.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.guto.projetoempresa.dao.ParticipaDao;
import br.dev.guto.projetoempresa.model.Participa;

@RestController
public class ParticipaController {
	
	@Autowired
	ParticipaDao dao;
	
	@GetMapping("/participa")
	public ArrayList<Participa> recupaerarParticipa(){
		return (ArrayList<Participa>)dao.findAll();
	}
	
}
