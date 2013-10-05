/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import utiles.DAOMoviles;
import utiles.MessageUtil;

/**
 *
 * @author yomero
 */
public class TestDaoMoviles {
    
    public static void main(String[] args) throws SQLException, IOException {
        
        DAOMoviles daoMoviles = new DAOMoviles();
        
        ArrayList<String> moviles = daoMoviles.ObtieneDatos();
        
        
        
    }
    
}
