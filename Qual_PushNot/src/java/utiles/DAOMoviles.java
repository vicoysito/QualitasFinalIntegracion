/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yomero
 */
public class DAOMoviles {
        /* LOCAL 
        private String PARAM_CONEXION_SERVER = "localhost:3306"; //
	private String PARAM_CONEXION_DB = "push";
	private String PARAM_CONEXION_USER = "root";
	private String PARAM_CONEXION_PWD = "23121984";
        private String tableMovil = "tbdis001";
        */
        /* 
         * PRODUCTION
         */
        private String PARAM_CONEXION_SERVER = "localhost:3306"; //
	private String PARAM_CONEXION_DB = "push";
	private String PARAM_CONEXION_USER = "root";
	private String PARAM_CONEXION_PWD = "hJDy63625+";
        private String tableMovil = "tbdis001";

    private Connection conexion = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private StringBuilder query  = null;
	
    private Statement obtieneConexion () throws SQLException, ClassNotFoundException{
    
    	Class.forName("com.mysql.jdbc.Driver");
    	conexion = DriverManager.getConnection("jdbc:mysql://"+PARAM_CONEXION_SERVER+"/"+PARAM_CONEXION_DB, PARAM_CONEXION_USER, PARAM_CONEXION_PWD);
    	statement = conexion.createStatement();
        return statement;
    }
    
    
    private void cierraConexion(){
    	try {
    		 if (conexion != null && !conexion.isClosed()) {
    	         	statement.close();
    	             conexion.close();
    	         }
        } catch (SQLException sqle) {
			// TODO: handle exception
		}
    	
    }
    
    
    
    
	public boolean IngresaDatos(String reg_id,String mac_adress,String tipo_telefono) throws SQLException {
		 boolean resultado = true;
	    try {
	    	
	    	statement = obtieneConexion();
            StringBuilder query = new StringBuilder("Insert into "+tableMovil+" (reg_id,mac_adress,tipo_dispositivo)");
            query.append("VALUES('").append(reg_id+"','"+mac_adress+"','"+tipo_telefono+"')");
	    	
	    	
            statement.execute(query.toString());
            resultado = true;
            return resultado;
	    	
	    } catch (SQLException sqle) {
	        sqle.printStackTrace(System.out);
	        	resultado = false;
	    } catch (Exception e) {
	        e.printStackTrace(System.out);
        		resultado = false;

	    } finally {
	    	cierraConexion();
	    }
	    return resultado;
	}
	
	
	
	public ArrayList<String> ObtieneDatos() throws SQLException {
	
               ArrayList<String> moviles = new ArrayList<String>();
                
	    try {
	    	StringBuilder query = new StringBuilder("select * from "+tableMovil+";");
	    	statement = obtieneConexion();
	    	resultSet = statement.executeQuery(query.toString());
	    	
	    	System.out.println("Contenido de la base de datos");

          while (resultSet.next())

          {  

                  String nombre = resultSet.getString("reg_id");
                  moviles.add(nombre);
                  System.out.println("Nombre: " + nombre);


          }
          
          
	    	
	    } catch (SQLException sqle) {
	        sqle.printStackTrace(System.out);
	    } catch (Exception e) {
	        e.printStackTrace(System.out);
	    } finally {
	    	cierraConexion();
	    }
            
            	    return moviles;

	}
    
}
