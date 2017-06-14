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
import javax.persistence.Table;

@Entity
@Table(name = "categoria_producto")

public class Categoria_producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_categoria;
    @Column(name = "nombre")
    private String nombre_categoria;
    @OneToMany(fetch = FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE},orphanRemoval = true,mappedBy = "categoria",targetEntity = Producto.class)
    private List<Producto> productos;

    public Categoria_producto() {
    }

    
    public Categoria_producto(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_categoria;
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
        final Categoria_producto other = (Categoria_producto) obj;
        if (this.id_categoria != other.id_categoria) {
            return false;
        }
        return true;
    }
    
}
