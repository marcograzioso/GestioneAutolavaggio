package it.rf.autolavaggio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.autolavaggio.model.Veicolo;
import it.rf.autolavaggio.repository.VeicoloRepository;

@Service
public class GenericService {
	
	@Autowired
	private VeicoloRepository vrepo;
	
	
	public boolean insertVeicolo(Veicolo v) {
		Optional<Veicolo> veicolo = this.vrepo.findById(v.getnTelaio());
		if(veicolo.isPresent()) {
			return false;
		}
		else {
			this.vrepo.save(v);
			return true;
		}
	}
	
}
