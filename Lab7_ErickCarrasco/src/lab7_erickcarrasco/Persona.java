/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_erickcarrasco;

/**
 *
 * @author erick
 */
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

public class Persona implements Serializable{
    private String nombre;
    private int edad;
    private Icon fotografia;
    private String user;
    private String password;
    private String sexo;
    private String premium;
    private ArrayList <String> mensajes = new ArrayList();
    private ArrayList <String> solicitudes = new ArrayList();
    private ArrayList <String> blocked = new ArrayList();
    
    private static final long SerialVersionUID =7899L;

    public Persona(String nombre, int edad, Icon fotografia, String user, String password, String sexo, String premium) {
        this.nombre = nombre;
        this.edad = edad;
        this.fotografia = fotografia;
        this.user = user;
        this.password = password;
        this.sexo = sexo;
        this.premium = premium;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografia) {
        this.fotografia = fotografia;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<String> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<String> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList<String> getBlocked() {
        return blocked;
    }

    public void setBlocked(ArrayList<String> blocked) {
        this.blocked = blocked;
    }
    
    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
}
