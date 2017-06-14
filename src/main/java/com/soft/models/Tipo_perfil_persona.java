/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tipo_perfil_persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_perssona;
    @Column(name = "tipo_perfil", nullable = false)
    private String tipo_perfil;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, orphanRemoval = true, mappedBy = "perfil_persona", targetEntity = persona_juridica.class)
    List<persona_juridica> personas_juridicas;
    public Tipo_perfil_persona() {
    }

    public Tipo_perfil_persona(String tipo_perfil) {
        this.tipo_perfil = tipo_perfil;
    }

    public int getId_tipo_perssona() {
        return id_tipo_perssona;
    }

    public void setId_tipo_perssona(int id_tipo_perssona) {
        this.id_tipo_perssona = id_tipo_perssona;
    }

    public String getTipo_perfil() {
        return tipo_perfil;
    }

    public void setTipo_perfil(String tipo_perfil) {
        this.tipo_perfil = tipo_perfil;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id_tipo_perssona;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tipo_perfil_persona other = (Tipo_perfil_persona) obj;
        if (this.id_tipo_perssona != other.id_tipo_perssona) {
            return false;
        }
        return true;
    }

}
