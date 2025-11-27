package br.com.senai.infob.controle.de.epi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="EPI")
public class Epi {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;

    @Column (name="nome_epi")
    private String nomeEpi;

    @Column (name="modelo")
    private String modelo;

    @ManyToOne
    @JoinColumn(name="id")
    private Emprestimo emprestimo;

    public Epi() {
    }

    public Epi(Integer id, String nomeEpi, String modelo, Emprestimo emprestimo) {
        this.id = id;
        this.nomeEpi = nomeEpi;
        this.modelo = modelo;
        this.emprestimo = emprestimo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeEpi() {
        return nomeEpi;
    }

    public void setNomeEpi(String nomeEpi) {
        this.nomeEpi = nomeEpi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    } 

    
}
