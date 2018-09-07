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
    private String descripzione;
    private ArrayList  mensajes = new ArrayList();
    private ArrayList <Persona> solicitudes = new ArrayList();
    private ArrayList <Persona> blocked = new ArrayList();
    private ArrayList intereses = new ArrayList();
    private ArrayList <Persona> amigos = new ArrayList();
    private ArrayList <Persona> interesados = new ArrayList();
    private ArrayList <Calendario> citas = new ArrayList();
    
    private static final long SerialVersionUID =7899L;

    public Persona(String nombre, int edad, Icon fotografia, String user, String password, String sexo, String premium, String descripzione) {
        this.nombre = nombre;
        this.edad = edad;
        this.fotografia = fotografia;
        this.user = user;
        this.password = password;
        this.sexo = sexo;
        this.premium = premium;
        this.descripzione= descripzione;
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

    public ArrayList<Calendario> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Calendario> citas) {
        this.citas = citas;
    }


    public void setMensajes(ArrayList mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<Persona> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Persona> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList<Persona> getBlocked() {
        return blocked;
    }

    public void setBlocked(ArrayList<Persona> blocked) {
        this.blocked = blocked;
    }

    public ArrayList getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList intereses) {
        this.intereses = intereses;
    }

    public ArrayList<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Persona> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Persona> getInteresados() {
        return interesados;
    }

    public void setInteresados(ArrayList<Persona> interesados) {
        this.interesados = interesados;
    }

    public String getDescripzione() {
        return descripzione;
    }

    public void setDescripzione(String descripzione) {
        this.descripzione = descripzione;
    }

    
    
    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
}
