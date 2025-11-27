package br.com.senai.infob.controle.de.epi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.Controle.de.EPI.models.Epi;
import br.com.senai.infob.Controle.de.EPI.services.EpiService;

@RestController
@RequestMapping("/epi")
public class EpiController {
    
    @Autowired
    public EpiService epiService;

    @GetMapping("/count")
    public long count() {
        return epiService.count();
    }

    @PostMapping("/salvar")
    public Epi salvar(@RequestBody Epi epi) {
        return epiService.salvar(epi);

    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = epiService.delete(id);
        if (deletou) {
            return "Epi removido com sucesso";
    }
        return "Falha ao remover o Epi";
    }

    @GetMapping("/buscar/{id}")
    public Epi buscar(@PathVariable Integer id) {
        return epiService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Epi> listar() {
        return epiService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Epi atualizar( @RequestBody Epi epi, @PathVariable Integer id) {
        return epiService.atualizar(epi, id);
    }

}
