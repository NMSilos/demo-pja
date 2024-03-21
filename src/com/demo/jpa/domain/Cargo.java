package com.demo.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name = "cargos")
public class Cargo extends AbstractEntity {

    @Column(nullable = false, length = 60, unique = true)
    private String nome;
    
    // muitos para 1
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
