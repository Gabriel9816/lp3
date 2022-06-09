package br.edu.ifms.lp3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.lp3.model.Regra;
import br.edu.ifms.lp3.repository.RegraRepository;
import br.edu.ifms.lp3.service.interfaces.RegraServiceInterface;

@Service
public class RegraService implements RegraServiceInterface{

	@Autowired
	RegraRepository repository;
	
	
	@Override
	public Regra addRegra(Regra regra) {
		
		
		return repository.save(regra);
		
	}

	@Override
	public long delete(long idRegra) {
		// TODO Auto-generated method stub
		
		
		
		return 0;
	}

	@Override
	public Regra update(Regra regra) {
		// TODO Auto-generated method stub
		
		return repository.save(regra);
		
	}

	@Override
	public Regra findById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Regra> listAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	
	
	
	
	
	
}
