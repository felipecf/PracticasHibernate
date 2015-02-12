package Modelo;

import java.io.Serializable;

public class Direccion implements Serializable{

    private int id;
    private String calle;
    private int numero;
    private int cp;

    public Direccion() {
    }

    public Direccion(String calle, int numero, int cp) {

        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    
}
