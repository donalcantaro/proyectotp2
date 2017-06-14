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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity

class Detalle_abastecimiento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalle;
    @Column(name = "aumento_producto",nullable = false)
    private int aumento_producto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_abastecimiento",nullable = false)
    private Abastecimiento abastecimiento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto",nullable = false)
    private Producto producto;

    public Detalle_abastecimiento() {
    }

    public Detalle_abastecimiento(int id_detalle, int aumento_producto, Abastecimiento abastecimiento, Producto producto) {
        this.id_detalle = id_detalle;
        this.aumento_producto = aumento_producto;
        this.abastecimiento = abastecimiento;
        this.producto = producto;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getAumento_producto() {
        return aumento_producto;
    }

    public void setAumento_producto(int aumento_producto) {
        this.aumento_producto = aumento_producto;
    }

    public Abastecimiento getAbastecimiento() {
        return abastecimiento;
    }

    public void setAbastecimiento(Abastecimiento abastecimiento) {
        this.abastecimiento = abastecimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_detalle;
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
        final Detalle_abastecimiento other = (Detalle_abastecimiento) obj;
        if (this.id_detalle != other.id_detalle) {
            return false;
        }
        return true;
    }
    
    
}
