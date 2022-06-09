package br.edu.ifms.lp3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Regra {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idRegra;
	private String nomeRegra;
	
	
	
	

}
