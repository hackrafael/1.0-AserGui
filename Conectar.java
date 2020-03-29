package aserradero;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conectar {
    Connection conectar = null;
    public Connection conexion(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar= DriverManager.getConnection("jdbc:mysql://localhost:3306/aserradero","root","");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }catch(ClassNotFoundException ex){
            
        }
        return conectar;
    }
    
}
