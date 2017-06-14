
package com.soft.controller;

import com.soft.models.Categoria_producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Controller_categoria_product {
    public void RegistraCategoria(Categoria_producto categoria){//metodo registrar la categoria
        SessionFactory sesion= NewHibernateUtil.getSessionFactory();//
        Session session;
        session = sesion.openSession();
        Transaction tras;//
        tras=session.beginTransaction();
        session.save(categoria);
        tras.commit();
        session.close();
    }
    public void Eliminar(Integer Idcategoria){
       //Categoria cat=null;
        Transaction trasn= null;
        Session sesion= NewHibernateUtil.getSessionFactory().openSession();
        try {
            trasn=sesion.beginTransaction();
            Categoria_producto cat=(Categoria_producto) sesion.load(Categoria_producto.class, new Integer(Idcategoria));
            sesion.delete(cat);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            if (trasn!=null) {
                trasn.rollback();
            }
            e.printStackTrace();
        }finally{
            sesion.flush();
            sesion.close();
        }
    }
    
}
