package br.edu.ifms.lp3.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAluno;

	private String nome;

	@Column(name = "email", unique = true)
	private String email;

	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
	private List<Conta> conta;

}
