
package sql;


import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    public static PreparedStatement stmt;
    public static Statement stm;
    public static Connection con;
    public static ResultSet rs;
    
    public static String conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siscef","root","");
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Driver nao encontrado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel realizar a conexao com o Banco de Dados");
        }
        return null;
        
    }
    public static String desconectar(){
        try{
            con.close();
            stmt.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    
}
