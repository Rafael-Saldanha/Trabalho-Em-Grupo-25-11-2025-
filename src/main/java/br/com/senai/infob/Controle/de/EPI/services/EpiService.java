package br.com.senai.infob.Controle.de.EPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.teste.models.Epi;
import com.senai.infob.teste.repositories.EpiRepository;
import java.util.List;

@Service
public class EpiService {
    
    @Autowired
    public EpiRepository epiRepository;

    public long count() {
        return epiRepository.count();
    }

    public Epi salvar(Epi epi) {
        return epiRepository.save(epi);

    }
    
    public boolean delete(Integer id) {
        Epi epi = epiRepository.findById(id).get();
        if(epi != null) {
            epiRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Epi buscar(Integer id) {
        return epiRepository.findById(id).get();
    }

    public List<Epi> listar() {
        return epiRepository.findAll();
    }

    public Epi atualizar(Epi epi, Integer id) {
        Epi e = buscar(id);
        if (e != null) {
            epi.setCalendarioId(id);
            return epiRepository.save(epi);
        }
        return null;

    }
}
