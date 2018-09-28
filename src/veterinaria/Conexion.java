
package veterinaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ML && MP
 */
public class Conexion {
    
    private String url;
    private String usuario;
    private String password;
    
    
    private Connection conexion;
    
    
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
       
        this.url = url;
        this.usuario = usuario;
        this.password = password;

        //Cargamos las clases de mariadb que implementan JDBC
        Class.forName("org.mariadb.jdbc.Driver");

    }
    
    
        public Connection getConexion() throws SQLException{
            
            if(conexion == null){          
              conexion = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"+ "&user=" + usuario + "&password=" + password);
            }
        
            return conexion;
        }
}
