package br.com.senai.infob.controle.de.epi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.Controle.de.EPI.models.Emprestimo;
import br.com.senai.infob.Controle.de.EPI.services.EmprestimoService;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
    
    @Autowired
    public EmprestimoService emprestimoService;

    @GetMapping("/count")
    public long count() {
        return emprestimoService.count();
    }

    @PostMapping("/salvar")
    public Epi salvar(@RequestBody Epi epi) {
        return emprestimoService.salvar(epi);

    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = emprestimoService.delete(id);
        if (deletou) {
            return "emprestimo removido com sucesso";
    }
        return "Falha ao remover o emprestimo";
    }

    @GetMapping("/buscar/{id}")
    public Epi buscar(@PathVariable Integer id) {
        return emprestimoService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Epi> listar() {
        return emprestimoService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Epi atualizar( @RequestBody Epi epi, @PathVariable Integer id) {
        return emprestimoService.atualizar(epi, id);
    }
    }


