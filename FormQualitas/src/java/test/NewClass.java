/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import paquete.EnvioMail;
import paquete.Persona;

/**
 *
 * @author yomero
 */
public class NewClass {
    public static void main(String[] args) {
      
    Persona per = new Persona();
        
        per.setNombre("Yo mero");
        per.setApPaterno("Espinoso");
        per.setApMaterno("Punks");
        
        EnvioMail e = new EnvioMail();
        
        e.enviaCorreo(per);    
        
    }

    
}
