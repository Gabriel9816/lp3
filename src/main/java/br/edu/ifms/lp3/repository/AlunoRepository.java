package br.edu.ifms.lp3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.lp3.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
