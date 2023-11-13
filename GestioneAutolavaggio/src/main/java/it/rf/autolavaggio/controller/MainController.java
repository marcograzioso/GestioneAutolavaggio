package it.rf.autolavaggio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.rf.autolavaggio.model.Veicolo;
import it.rf.autolavaggio.service.GenericService;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	
	@Autowired
	private GenericService service;
	
	
	@PostMapping(value = "/insert_veicolo")
	public String insertVeicolo(@ModelAttribute Veicolo v) {
		this.service.insertVeicolo(v);
		return "result";
	}



	
	
}
