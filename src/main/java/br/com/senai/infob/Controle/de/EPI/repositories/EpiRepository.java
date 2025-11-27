package br.com.senai.infob.controle.de.epi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.infob.Controle.de.EPI.models.Epi;

@Repository
public interface EpiRepository extends JpaRepository<Epi, Integer> {

}