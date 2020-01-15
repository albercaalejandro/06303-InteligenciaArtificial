/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class Maceta implements Serializable {

    public static final int MIN = 3;
    public static final int MAX = 10;
    public static final String DEF_NOMBRE = "Anita";
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");
    private String nombreUs;

    public Maceta() {
        
        nombreUs = DEF_NOMBRE;
    }
     

    public Maceta(String nombreUs) {
        
        if (!validar(nombreUs)){
            this.nombreUs = nombreUs;
            
        } else {
        this.nombreUs = DEF_NOMBRE;
        }
        
        
    }


    public void setNombre(String nombreUs) {
         if (!validar(nombreUs)){
            this.nombreUs = nombreUs;
         }
       
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); 
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.nombreUs);
        return hash;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s",nombreUs);
    }
    

    
    private boolean validar(String nombreUs) {
        return nombreUs.contains(" ") || !(nombreUs.length() >= MIN) || !(nombreUs.length() <= MAX);
    }

}
