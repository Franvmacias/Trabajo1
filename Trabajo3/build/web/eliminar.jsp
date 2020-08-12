<%-- 
    Document   : eliminar
    Created on : 25-jul-2020, 16:43:48
    Author     : Franc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body class="light-green darken-2">
    <c:import url="menu.jsp"/>
        <div class="row">
            <div class="col s6 offset-s3">
                <div class="card-panel z-depth-5">
                    <h4 class="center-align">Factura</h4>
                    <form action="control.do" method="post">
                          <div class="input-field">
                              <input id="codigo" type="text" name="codigo" value="${param.codigo}" readonly>
                            <label for="codigo">Número de Factura</label>
                        </div>
                        <div class="input-field">
                            <input id="producto" type="text" name="producto" value="${param.producto}" readonly>
                            <label for="producto">Nombre de Cliente</label>
                        </div>
                        <div class="input-field">
                            <input id="precio" type="text" name="precio" value="${param.precio}" readonly>
                            <label for="precio">Nombre de Proveedor</label>
                        </div>
                        <div class="input-field">
                            <input id="stock" type="text" name="stock" value="${param.stock}" readonly>
                            <label for="stock">Stock</label>
                        </div>
                        <div class="input-field">
                            <input id="categoria" type="text" name="categoria" value="${param.categoria}" readonly>
                            <label for="categoria">Categoría</label>
                        </div>
                            <button name="bt" value="2" type="submit" class="btn right red">Eliminar</button>
                        <br><br>
                    </form>
                </div>
            </div>
        </div>
        
        
        
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script type="text/javascript">
            $(function(){
                $(".button-collapse").sideNav();
            });
            
            
        </script>
    </body>
  </html>