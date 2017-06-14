package com.soft.Hiberante_session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernate_Session {

    private Session sesion;
    private static hibernate_Session instancia_sesion = null;

    public static hibernate_Session get_instancia_hibernate_Sesion() {
        if (instancia_sesion == null) {
            instancia_sesion = new hibernate_Session();
        }
        return instancia_sesion;
    }
    
    private hibernate_Session() {
        Configuration configuracion = new Configuration();
        configuracion.configure();
        SessionFactory sefactory = configuracion.buildSessionFactory();
        sesion=sefactory.openSession();
    }

    public Session AbrirSession() {
        this.sesion.beginTransaction();
        return this.sesion;
    }

   
}
