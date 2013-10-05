package paquete;

import java.util.*;
import java.util.ArrayList;



public class EnvioMail {

	public void enviaCorreo(Persona persona){
	    try{
	    	
	    	List<String> listaDest =  new ArrayList<String>();
	    	String remitente = "alan.cedeno@planetmedia.com.mx";
	    	String asunto = "prueba mail";
	    	String cuerpo = "Persona:  \n";
                cuerpo=cuerpo+"Nombre: "+persona.getApPaterno()+" "+persona.getApMaterno()+" "+persona.getNombre();
                cuerpo=cuerpo+"\nDireccion: ";
                cuerpo=cuerpo+"\ncalle: "+persona.getCalle();
                cuerpo=cuerpo+"\nNo Ext: "+persona.getNoExt();
	    	
	    	//listaDest.add("alandan16@gmail.com");
                listaDest.add("planetdemoqtas@gmail.com");
                listaDest.add("im.vicoy@gmail.com");
                listaDest.add("alandan16@gmail.com");
	    	
            CorreoService.enviarCorreoCamapania(listaDest, remitente, asunto, cuerpo);

        } catch (Exception ex) {
           
        }
		
	}
		
	}