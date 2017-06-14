package com.soft.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
@PrimaryKeyJoinColumn(name = "id_persona")
public class Empleado extends Persona implements Serializable {

    @Column(name = "usuario", nullable = false)
    private String Usuario;
    @Column(name = "password", nullable = false)
    private String Password;
    @Column(name = "sueldo", nullable = false)
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String Usuario, String Password, double sueldo, int id_persona, String nombre, String apellido, int dni, int telefono, String direccion, String email, char sexo) {
        super(id_persona, nombre, apellido, dni, telefono, direccion, email, sexo);
        this.Usuario = Usuario;
        this.Password = Password;
        this.sueldo = sueldo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Usuario=" + Usuario + ", Password=" + Password + ", sueldo=" + sueldo + '}';
    }
    
    

}
