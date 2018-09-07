/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_erickcarrasco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class adminPersonas {
    private ArrayList <Persona> listaPersonas = new ArrayList();
    private File archivo = null;

    public adminPersonas(String path) {
        archivo = new File (path);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    public void setPersona(Persona p){
        this.listaPersonas.add(p);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Persona temp;
            if (archivo.exists()) {
                FileInputStream entrada 
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp= (Persona) objeto.readObject())!=null){
                        listaPersonas.add(temp);
                    }
                } catch (Exception e) {
                    //Encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception ocurred");
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw =null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            
            for (Persona t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }
        finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
}
