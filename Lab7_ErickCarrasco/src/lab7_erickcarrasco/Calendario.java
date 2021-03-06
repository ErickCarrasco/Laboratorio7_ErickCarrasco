/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_erickcarrasco;

import java.io.Serializable;

/**
 *
 * @author erick
 */
public class Calendario implements Serializable{
    private String fecha;
    private Persona persona;
    private String lugar;
    private static final long SerialVersionUTD = 777L;

    public Calendario() {
    }

    public Calendario(String fecha, Persona persona, String lugar) {
        this.fecha = fecha;
        this.persona = persona;
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return persona.getNombre();
    }
    
    
}
