package br.com.senai.infob.Controle.de.EPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.Controle.de.EPI.models.Usuario;
import br.com.senai.infob.Controle.de.EPI.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public Usuario cadastrar(@RequestBody Usuario usuario, @RequestParam String confSenha){
        if(usuario.getSenha().equals(confSenha)){
            return usuarioService.salvar(usuario);
        }
        return null;
    }

    @PostMapping
    public Usuario login(@RequestParam String email, @RequestParam String senha){
        Usuario u = new Usuario();
        u.setEmail(email);
        u.setSenha(senha);
        return usuarioService.login(u);
    }
}
