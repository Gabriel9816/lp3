package br.edu.ifms.lp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.lp3.service.UsuarioService;

@Controller // definindo essa clase como controladora
@RequestMapping("/usuario") // caminho
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
}
