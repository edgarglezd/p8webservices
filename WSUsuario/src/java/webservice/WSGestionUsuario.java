/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Modelo.*;
/**
 *
 * @author YUGEN
 */
@WebService(serviceName = "WSGestionUsuario")
public class WSGestionUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Validar")
    public Cuenta Validar(@WebParam(name = "id") String id, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Cvv") String Cvv) {
        //TODO write your implementation code here:
        CuentaDAO cue = new CuentaDAO();
        Cuenta cuenta = cue.verificaUsuario(id, Nombre, Cvv);
        
        return cuenta;
    }
}
