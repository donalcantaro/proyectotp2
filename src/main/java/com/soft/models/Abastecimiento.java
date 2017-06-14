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
public class Abastecimiento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_abastecimiento;
    @Column(name = "fecha_compra",nullable = false)
    private Timestamp fecha_compra;
    @Column(name = "total_compra",nullable = false)
    private Double total_compra;
    @Column(name = "descuento_compra",nullable = false)
    private Double descuento_compra;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE},orphanRemoval = true,mappedBy = "abastecimiento",targetEntity = Detalle_abastecimiento.class)
    List<Detalle_abastecimiento> detalles;
    
    public Abastecimiento() {
    }

    public int getId_abastecimiento() {
        return id_abastecimiento;
    }

    public void setId_abastecimiento(int id_abastecimiento) {
        this.id_abastecimiento = id_abastecimiento;
    }

    public Timestamp getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Timestamp fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Double getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(Double total_compra) {
        this.total_compra = total_compra;
    }

    public Double getDescuento_compra() {
        return descuento_compra;
    }

    public void setDescuento_compra(Double descuento_compra) {
        this.descuento_compra = descuento_compra;
    }

    public List<Detalle_abastecimiento> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle_abastecimiento> detalles) {
        this.detalles = detalles;
    }
    
    
}
