package br.edu.ifms.lp3.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idConta;
	private String username;
	private String password;
	
	private boolean contaNaoExpirada;
	private boolean contaNaoBloqueada;
	private boolean credencialNaoExpira;
	private boolean habilitada;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "idAluno")
	private Aluno aluno;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "idRegra")
	private Regra regra;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
