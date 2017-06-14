/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.models;

import java.io.Serializable;
import java.security.Timestamp;
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
public class Alamacen implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_almacen;
    @Column(name = "nombre",nullable = false)
    private String nombre_almacen;
    @Column(name = "fecha_entrada",nullable = false)
    private Timestamp fecha_entrada;
    @Column(name = "fecha_salida",nullable = false)
    private Timestamp fecha_salida;
    @Column(name = "cantidad",nullable = false)
    private int cantidad;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE},orphanRemoval = true,mappedBy = "almacen", targetEntity = Producto.class)
    List<Producto> miproductos;

    public Alamacen() {
    }

    public int getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(int id_almacen) {
        this.id_almacen = id_almacen;
    }

    public String getNombre_almacen() {
        return nombre_almacen;
    }

    public void setNombre_almacen(String nombre_almacen) {
        this.nombre_almacen = nombre_almacen;
    }

    public Timestamp getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Timestamp fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Timestamp getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Timestamp fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<Producto> getMiproductos() {
        return miproductos;
    }

    public void setMiproductos(List<Producto> miproductos) {
        this.miproductos = miproductos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id_almacen;
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
        final Alamacen other = (Alamacen) obj;
        if (this.id_almacen != other.id_almacen) {
            return false;
        }
        return true;
    }
    
}
