    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.sql.*;
/**
 *
 * @author Oscar
 */
public class CuentaDAO {
    Conexion conexion;
    
    public CuentaDAO(){
        conexion = new Conexion();
    }


    public Cuenta verificaUsuario(String id, String Nombre, String Cvv){
        Cuenta cuenta=null;
        Connection accesoDB = conexion.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from clientes where id=? and Nombre=? and Cvv=?");
            ps.setString(1, id);
            ps.setString(2, Nombre);
            ps.setString(3, Cvv);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               cuenta = new Cuenta();
               cuenta.setid(rs.getString(1));
               cuenta.setNombre(rs.getString(2));
               cuenta.setCvv(rs.getString(3));
               cuenta.setSaldo(rs.getInt(4));
               return cuenta;
            }
        } catch (Exception e) {
        }
        return cuenta;
    }
    
    public String registraUsuario(String id, String Nombre, String Cvv){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("insert into clientes(id,Nombre,Cvv) values (?,?,?)");
            ps.setString(1, id);
            ps.setString(2, Nombre);
            ps.setString(3, Cvv);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
}
