package com.demo.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "departamentos")
public class Departamento extends AbstractEntity {

    @Column(nullable = false, length = 60, unique = true)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
