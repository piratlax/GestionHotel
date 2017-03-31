
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    public String db="base_reserva";
    public String url="jdbc://mysql://127.0.0.1/"+db;
    public String user="root";
    public String clave="";

    public conexion() {
    }
    
    public Connection conectar() {
     Connection link=null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            link=DriverManager.getConnection(url,user,clave);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
}
