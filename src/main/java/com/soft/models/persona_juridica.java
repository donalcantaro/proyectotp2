/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class persona_juridica extends cliente_natural implements Serializable{

    @Column(name = "ruc", nullable = false, precision = 12)
    private int ruc;
    @Column(name = "organizacion", nullable = false)
    private String organizacion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_perfil",nullable = false)
    private Tipo_perfil_persona perfil_persona;
    public persona_juridica() {
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public Tipo_perfil_persona getPerfil_persona() {
        return perfil_persona;
    }

    public void setPerfil_persona(Tipo_perfil_persona perfil_persona) {
        this.perfil_persona = perfil_persona;
    }

}
