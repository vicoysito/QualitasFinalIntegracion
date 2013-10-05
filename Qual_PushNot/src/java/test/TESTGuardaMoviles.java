/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import java.util.ArrayList;
import utiles.DAOMoviles;
import utiles.MessageUtil;

/**
 *
 * @author yomero
 */
public class TESTGuardaMoviles {
    
    public static void main(String[] args) throws SQLException {
        DAOMoviles gm = new DAOMoviles();
        //gm.IngresaDatos("Reg_ID", "reg2", "3");
        
        regmovil("APA91bFbFV8V9sU7nCNyDvI2fKRFD4xa2eoPk8-gOs5m7BzCgnQ7nFxOTagAclf5R_ExNsE9uegmdIDzoDnsZqTy5dnIrn2RgT_dTBy6v5uqntWMLvclFwbTQ07qdTJPqZtrKEEPNK6swsNfLPmCtvkXPmZCeVnniQ", "mac_tableta","1");
                
    }

    private static boolean regmovil(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        ws.Regmovil_Service service = new ws.Regmovil_Service();
        ws.Regmovil port = service.getRegmovilPort();
        return port.regmovil(arg0, arg1, arg2);
    }
    
}
