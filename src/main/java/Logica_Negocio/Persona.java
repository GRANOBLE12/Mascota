/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class Persona {
    
    private String Identificacion;
    private String Nombre;
    public ArrayList<Perro> lsperros;

    public Persona() {
    }

    public Persona(String Identificacion, String Nombre) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Perro> getLsperros() {
        return lsperros;
    }

    public void setLsperros(ArrayList<Perro> lsperros) {
        this.lsperros = lsperros;
    }
    
    
    
}
