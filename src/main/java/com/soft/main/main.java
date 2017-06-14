/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.main;
import com.soft.Hiberante_session.hibernate_Session;
import org.hibernate.Session;

public class main {
    public static void main(String[] args) {
       
       hibernate_Session sesionHiberntae=hibernate_Session.get_instancia_hibernate_Sesion();
        Session sesion=sesionHiberntae.AbrirSession();
//        sesion.createCriteria(Producto.class).list().stream().forEach(System.out::println);
//        sesion.getTransaction().commit();
    }
}
