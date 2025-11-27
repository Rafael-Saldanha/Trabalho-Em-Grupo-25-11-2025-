package br.com.senai.infob.controle.de.epi.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.Controle.de.EPI.models.Emprestimo;
import br.com.senai.infob.Controle.de.EPI.repositories.EmprestimoRepository;

@Service
public class EmprestimoService {

@Autowired
public EmprestimoRepository emprestimoRepository;

public Long count() {
return emprestimoRepository.count();
}

 public Emprestimo salvar(Emprestimo emprestimo) {
return emprestimoRepository.save(emprestimo);
}

public boolean deletar(Integer id) {
 Emprestimo emprestimo = emprestimoRepository.findById(id).get();
 if (emprestimo != null) {
 emprestimoRepository.deleteById(id);
 return true;
}
return false;
}

public Emprestimo buscar(Integer id) {
return emprestimoRepository.findById(id).get();
}

 public List<Emprestimo> listar() {
return emprestimoRepository.findAll();
}

public Boolean atualizarBoolean(Emprestimo emprestimo, Integer id) {
if (emprestimoRepository.existsById(id)) {
emprestimo.setId(id);
 emprestimoRepository.save(emprestimo);
 return true;
 }
 return false;
}
}
