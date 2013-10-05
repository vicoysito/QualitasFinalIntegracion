/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import utiles.DAOMoviles;

/**
 *
 * @author yomero
 */
@WebService(serviceName = "regmovil")
public class regmovil {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "regmovil")
    public boolean SaveKey(String reg_id,String mac_adress,String tipo_telefono){
		boolean resultado = false;
		DAOMoviles gm = new DAOMoviles();
		
		try {
			resultado = gm.IngresaDatos(reg_id,mac_adress,tipo_telefono);
                        System.out.println("RESULTADO SaveKey::"+resultado);
			return resultado;

		} catch (SQLException sqle) {
	        sqle.printStackTrace(System.out);
	    } catch (Exception e) {
	        e.printStackTrace(System.out);
	    }
		
		return resultado;
		
		
	}
	
}
