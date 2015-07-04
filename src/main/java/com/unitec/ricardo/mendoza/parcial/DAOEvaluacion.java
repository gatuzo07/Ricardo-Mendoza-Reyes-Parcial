/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.ricardo.mendoza.parcial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gatuzo07
 */
public class DAOEvaluacion {
    static SessionFactory factory;
    static Session sesion;
    static Transaction tranza; 
    
    public static void abrirSesion(){
        factory= MiConfiguracionHibernate.getSessionFactory();
        sesion= factory.openSession();
        tranza= sesion.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        sesion.close();
    }
    
    public void guardar(Evaluacion u)throws Exception{
        
    }
}
