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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    @Column(name = "nombre_producto",nullable = false)
    private String nombre_producto;
    @Column(name = "stock",nullable = false)
    private int stock;
    @Column(name = "costo_producto",nullable = false)
    private Double costo_producto;
    @Column(name = "marca",nullable = false)
    private String marca;
    @Column(name = "descripcion",nullable = true)
    private String descripcion;
    @Column(name = "unidad_medida",nullable = false)
    private String unidad_media;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cateforia",nullable = false)
    private Categoria_producto categoria;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_almacen",nullable = false)
    private Alamacen almacen;
    @OneToMany(mappedBy = "producto",cascade = {CascadeType.PERSIST,CascadeType.REMOVE},orphanRemoval = true,targetEntity = Detalle_abastecimiento.class)
    List<Detalle_abastecimiento> detalle_abastecimiento;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, orphanRemoval = true, mappedBy = "producto", targetEntity = Detalle_venta.class)
    List<Detalle_venta> detalle_ventas;
    
    public Producto(int id_producto, String nombre_producto, int stock, Double costo_producto, String marca, String descripcion, String unidad_media) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.stock = stock;
        this.costo_producto = costo_producto;
        this.marca = marca;
        this.descripcion = descripcion;
        this.unidad_media = unidad_media;
    }

    public Producto() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getCosto_producto() {
        return costo_producto;
    }

    public void setCosto_producto(Double costo_producto) {
        this.costo_producto = costo_producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad_media() {
        return unidad_media;
    }

    public void setUnidad_media(String unidad_media) {
        this.unidad_media = unidad_media;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id_producto;
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
        final Producto other = (Producto) obj;
        if (this.id_producto != other.id_producto) {
            return false;
        }
        return true;
    }
    
}
