package Modelo;

import java.io.Serializable;

public class Personas implements Serializable{

    private int id;
    private String nombre;
    private String ap_pat;
    private String ap_mat;

    public Personas() {
    }

    public Personas(String nombre, String ap_pat, String ap_mat) {

        this.nombre = nombre;
        this.ap_pat = ap_pat;
        this.ap_mat = ap_mat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }
    

}
