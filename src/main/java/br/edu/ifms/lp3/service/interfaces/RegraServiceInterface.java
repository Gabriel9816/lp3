package br.edu.ifms.lp3.service.interfaces;

import java.util.List;

import br.edu.ifms.lp3.model.Regra;

public interface RegraServiceInterface {
	
	Regra addRegra(Regra regra);
	
	long delete(long idRegra);
	
	Regra update(Regra regra);
	
	Regra findById(long id);
	
	List<Regra> listAll();
	
	
	
	

}
