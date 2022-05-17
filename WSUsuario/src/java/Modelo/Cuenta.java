/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Oscar
 */
public class Cuenta {
    private String id;
    private String Nombre;
    private String Cvv;
    private int Saldo;
    
    public Cuenta(){
        id="";
        Nombre="";
        Cvv="";
        Saldo=0;
         
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCvv() {
        return Cvv;
    }

    public void setCvv(String Cvv) {
        this.Cvv = Cvv;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
}
