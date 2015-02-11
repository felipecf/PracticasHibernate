/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pruebas;

import ConfiguracionHibernate.HibernateUtil;
import DAOS.PersonasDAO;
import POJOS.Nombres;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Felipe
 */


public class Prueba {
    
    public static void main(String[] args) {
        
        List<Nombres> resulset;
        
        Nombres persona = new Nombres(/*"Bolillo","Perez","Pinto"*/);
        
        persona.setNombre("Anaid");
        persona.setApPat("Tapia");
        persona.setApMat("Sanchez");

        PersonasDAO insert = new PersonasDAO();
        
        insert.guardaPersona(persona);
        
        PersonasDAO select = new PersonasDAO();
        
        resulset = select.obtenListaContactos();
        
        int i=1;
        for (Nombres rs : resulset) {
                System.out.println(i++ + "->"+ rs.getNombre());
        }

        HibernateUtil.getSessionFactory().close();
    }
}
