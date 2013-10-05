/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utiles.DAOMoviles;
import utiles.MessageUtil;

/**
 *
 * @author yomero
 */
public class TestPush {
    
    public static void main(String[] args) throws SQLException {
        
        /******************PUSH ******************///
        DAOMoviles daoMoviles = new DAOMoviles();
        
        List<String> moviles = daoMoviles.ObtieneDatos();
            
        
        try {
            MessageUtil.sendMsj(moviles, "MENSAJE ENVIADO");
            System.out.println("PRUEBA SEND");
        } catch (Exception e) {
        }
    }
    
}
