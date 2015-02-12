package Pruebas;

import Conexion.HibernateUtil;
import Modelo.Direccion;
import Modelo.Personas;
import org.hibernate.Session;

public class Pruebas {
    
    public static void main(String[] args) {
    
        Personas persona1 = new Personas(); 
        persona1.setNombre("Juan");  
        persona1.setAp_pat("Lopez");
        persona1.setAp_mat("urquidi");

        Personas persona2 = new Personas(); 
        persona2.setNombre("Felipe"); 
        persona2.setAp_pat("Cruz");
        persona2.setAp_mat("Fabian");

        Direccion direccion1 = new Direccion(); 
        direccion1.setCalle("Calle 1"); 
        direccion1.setNumero(134);
        direccion1.setCp(12345);  

        Direccion direccion2 = new Direccion(); 
        direccion2.setCalle("Calle 2");
        direccion2.setNumero(234);
        direccion2.setCp(54321);  

        persona1.setDireccion(direccion1); 
        persona2.setDireccion(direccion2);  

        Session sesion = HibernateUtil.getSessionFactory().openSession();   

        /*Esta direccion se agrega para comprobar que las personas tomen el mismo 
        identificador que las direcciones (ninguna persona debe tener el mismo id de
        esta direccion)*/ 

        Direccion d = new Direccion(); 
        d.setCalle("Calle de Prueba de identificadores"); 
        d.setNumero(134);
        d.setCp(21345);           

        /*En la primer sesion a la base de datos almacenamos los dos objetos Persona 
        los objetos Direccion se almacenaran en cascada*/ 
        sesion.beginTransaction();  

        sesion.persist(d); 
        sesion.persist(persona1); 
        sesion.persist(persona2);  

        sesion.getTransaction().commit(); 
        sesion.close();   


        /*En la segunda sesion eliminamos el objeto persona1, 
        la direccion1 sera borrada en cascada*/ 
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        sesion.beginTransaction();  

        sesion.delete(persona1);  

        sesion.getTransaction().commit(); 
        sesion.close(); 
    
    }
}
