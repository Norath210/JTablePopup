/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Vector;

/**
 *
 * @author Castelao
 */
public class Persona {
    String nif;
    String nombre;
    String telefono;
    String edad;
    String profesion;

    public Persona(String nif, String nombre,  String edad,String telefono, String profesion) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public Vector toVector(){
        Vector result = new Vector(5);
        result.add(0,this.getNif());
        result.add(1,this.getNombre());
        result.add(2,this.getEdad());
        result.add(3,this.getProfesion());
        result.add(4,this.getTelefono());
        
        
        return result;
    }
    public static Persona fromVector(Vector vp){
        return new Persona((String)vp.get(0),(String)vp.get(1),(String)vp.get(2),(String)vp.get(3),(String)vp.get(4));        
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + nif.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.nif != other.nif) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + nif + ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + ", profesion=" + profesion + '}';
    }
    
    
}
