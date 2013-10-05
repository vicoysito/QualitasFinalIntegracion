
import services.Persona;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomero
 */
public class PruebaForm {
    
    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setNombre("Victor");
        p.setApPaterno("Espinosa");
        
        recibeForm(p);
    }

    private static boolean recibeForm(services.Persona per) {
        services.FormWS_Service service = new services.FormWS_Service();
        services.FormWS port = service.getFormWSPort();
        return port.recibeForm(per);
    }
    
}
