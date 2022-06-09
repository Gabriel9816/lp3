package br.edu.ifms.lp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.lp3.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
