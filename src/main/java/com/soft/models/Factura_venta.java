
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Factura_venta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_factura_venta;
    @Column(name = "fecha_factura",nullable = false)
    private Timestamp fecha_factura;
    @Column(name = "total_producto",nullable = false)
    private int total_producto;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente_natural",nullable = false)
    private cliente_natural cliente_natural;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, orphanRemoval = true, mappedBy = "factura_venta", targetEntity = Detalle_venta.class)
    List<Detalle_venta> detalle_ventas;
   
    public Factura_venta() {
    }

    public int getId_factura_venta() {
        return id_factura_venta;
    }

    public void setId_factura_venta(int id_factura_venta) {
        this.id_factura_venta = id_factura_venta;
    }

    public Timestamp getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Timestamp fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public int getTotal_producto() {
        return total_producto;
    }

    public void setTotal_producto(int total_producto) {
        this.total_producto = total_producto;
    }

    public cliente_natural getCliente_natural() {
        return cliente_natural;
    }

    public void setCliente_natural(cliente_natural cliente_natural) {
        this.cliente_natural = cliente_natural;
    }
    
    
}
