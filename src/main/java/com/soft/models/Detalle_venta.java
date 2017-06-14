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
public class Detalle_venta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalle;
    @Column(name = "unidad_producto",nullable = false)
    private String unidad_producto;
    @Column(name = "cantidad_producto",nullable = false)
    private int cantidad_producto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_factura_venta", nullable = false)
    private Factura_venta factura_venta;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    public Detalle_venta() {
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public String getUnidad_producto() {
        return unidad_producto;
    }

    public void setUnidad_producto(String unidad_producto) {
        this.unidad_producto = unidad_producto;
    }

    public Factura_venta getFactura_venta() {
        return factura_venta;
    }

    public void setFactura_venta(Factura_venta factura_venta) {
        this.factura_venta = factura_venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
            }