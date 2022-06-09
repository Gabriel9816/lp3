package br.edu.ifms.lp3.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.lp3.repository.AlunoRepository;

@RestController
@RequestMapping(value="/api")
public class AlunoResource {

	@Autowired
	AlunoRepository repository;
	
	
	@GetMapping(value= "/mensagem")
	public String mensagem() {
		
		
		return "Ola";
		
	} 
	
	@GetMapping(value = "/somar/{n1}/{n2}")
public double somar(@PathVariable double n1, @PathVariable double n2){ 
		
		return n1 + n2;
		
	}
	
	@PostMapping(value = "/subtrair")
	@ResponseBody
	public double subtrair(@RequestParam double n1, @RequestParam double n2){ 
			
			return n1 - n2;
			
		}
	
	
}
