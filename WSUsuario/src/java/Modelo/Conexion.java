/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.sql.*;
import java.sql.DriverManager;


public class Conexion {
    public Conexion() {
    }

    public Connection getConexion(){
        Connection con=null;
        try{
            /* Carga|Registra el driver JDBC */
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false", "root","");
        }catch (Exception e){
            System.err.println("Error: "+e);
        }
        return con;
    } 
}

