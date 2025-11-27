package br.com.senai.infob.controle.de.epi.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_entrega")
    private LocalDateTime dataEntrega;

    @Column(name="data_devolução")
    private LocalDateTime dataDevolucao;

    @Column(name="estado_Emprestimo")
    private Boolean estadoEmprestimo;

    @Column(name="condicao_da_epi")
    private String condicaoEPI;

    public Emprestimo() {
    }

    public Emprestimo(Integer id, LocalDateTime dataEntrega, LocalDateTime dataDevolucao, Boolean estadoEmprestimo,
            String condicaoEPI) {
        this.id = id;
        this.dataEntrega = dataEntrega;
        this.dataDevolucao = dataDevolucao;
        this.estadoEmprestimo = estadoEmprestimo;
        this.condicaoEPI = condicaoEPI;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Boolean getEstadoEmprestimo() {
        return estadoEmprestimo;
    }

    public void setEstadoEmprestimo(Boolean estadoEmprestimo) {
        this.estadoEmprestimo = estadoEmprestimo;
    }

    public String getCondicaoEPI() {
        return condicaoEPI;
    }

    public void setCondicaoEPI(String condicaoEPI) {
        this.condicaoEPI = condicaoEPI;
    }

    

}
