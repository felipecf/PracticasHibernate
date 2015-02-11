/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOS;

import ConfiguracionHibernate.HibernateUtil;
import POJOS.Nombres;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Felipe
 */


public class PersonasDAO {
    
    private Session sesion; 
    private Transaction tx; 
    
    public void guardaPersona(Nombres persona){
        try {
            iniciaOperacion();
            sesion.save(persona);
            tx.commit();
        } catch (HibernateException e) {
            manejaExcepcion(e);
            throw e;
        }finally{
            sesion.close();
        }
    }
    
    public List<Nombres> obtenListaContactos() throws HibernateException 
    { 
        List<Nombres> listaContactos = null;  
    
        try 
        { 
            iniciaOperacion(); 
            listaContactos = sesion.createQuery("from Nombres").list(); 
        }finally 
        { 
            sesion.close(); 
        }  

        return listaContactos; 
    }

    private void iniciaOperacion() throws HibernateException 
    { 
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }  

    private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    }
}
