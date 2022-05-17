<%-- 
    Document   : index
    Created on : 16/05/2022, 11:47:14 AM
    Author     : YUGEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Validacion</h1>
         <form action="SAutentificacion" method="POST">
             
             <table border="0" style="margin-left: 28%">
                 <thead>
                     <tr>
                         <th></th>
                         <th></th>
                     </tr>
                 </thead>
                 <tbody>
                     <tr>
                         <td>Número de tarjeta:</td>
                         <td><input type="text" name="txtid" value=""/></td>
                     </tr>
                     <tr>
                         <td>Nombre</td>
                         <td><input type="text" name="txtNombre" value=""/></td>
                     </tr>
                     <tr>
                         <td>CVV</td>
                         <td><input type="text" name="txtCvv" value=""/></td>
                     </tr>
                     <tr>
                         <td><input type="submit" value="Validar" name="btnIngre"/></td>
                         <td></td>
                     </tr>
                 </tbody>
             </table>

         </form>
         
    </body>
</html>
