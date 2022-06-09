package br.edu.ifms.lp3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.lp3.model.Regra;

public interface RegraRepository extends JpaRepository<Regra, Long>{

	Regra findById(long id);
	
}
