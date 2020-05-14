/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoplantilla;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author lcesary
 */
public class BaseDatos {
    private Connection con;
    
    public void conectar(){
         String Driver = "com.mysql.jdbc.Driver";
        String ConnectString = "jdbc:mysql://localhost:3306/plantilla";
        String root = "root";
        String contraseña = "";
        try {
             Class.forName(Driver);
            con = DriverManager.getConnection(ConnectString,root,contraseña);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public String consulta(String consulta){
        conectar();
        String cons = null;
        Statement stmt;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from mienbro where idmiembro = "+consulta);
            while (rs.next()) {
                cons = rs.getString("funcion");
            }
            stmt.close();
            cerrarConexion();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }
    public boolean validar(String id, String pass){
        conectar();
        String cons = null;
        Statement stmt;
        boolean a ;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from mienbro where idmiembro = "+id+" and contraseña = "+pass);
            while (rs.next()) {
                cons = rs.getString("funcion");
            }
            stmt.close();
            cerrarConexion();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (cons == null) {
            a = false;
        }else{
            a= true;
        }
        return a;
    }
    
    public void cerrarConexion(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
   /* private  BaseDatos(){
        String Driver = "com.mysql.jdbc.Driver";
        String ConnectString = "jdbc:mysql://localhost:3306/plantilla";
        String root = "root";
        String contraseña = "";
        try {
             Class.forName(Driver);
            con = DriverManager.getConnection(ConnectString,root,contraseña);
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    
    
    public static void main(String[] args) {
        BaseDatos cn = new BaseDatos();
        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from mienbro");
            while (rs.next()) {
                System.out.println(rs.getInt("idmiembro")+" "+rs.getString("funcion"));   
            }
            cn.con.close();
        } catch (Exception e) {
            System.out.println("error"+e);
        }
    }*/
    
}

