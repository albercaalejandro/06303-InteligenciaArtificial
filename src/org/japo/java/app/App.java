/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import org.japo.java.entities.Maceta;
/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class App {
     public final void launchApp(){
         
         
         Maceta m2 = new Maceta("rojo");
         System.out.println(m2);
         m2.setNombre("Marron");
         System.out.println(m2);
     }
}
