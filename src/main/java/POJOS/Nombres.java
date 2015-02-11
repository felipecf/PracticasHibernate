package POJOS;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Felipe
 */

public class Nombres implements Serializable{

    private Long id;
    private String nombre;
    private String ApPat;
    private String ApMat;

    public Nombres() {
    }

    public Nombres(String nombre, String ApPat, String ApMat) {
        this.nombre = nombre;
        this.ApPat = ApPat;
        this.ApMat = ApMat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(String ApPat) {
        this.ApPat = ApPat;
    }

    public String getApMat() {
        return ApMat;
    }

    public void setApMat(String ApMat) {
        this.ApMat = ApMat;
    }   
    
}
