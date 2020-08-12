<%-- 
    Document   : buscar
    Created on : 25-jul-2020, 16:43:39
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
                    <h4 class="center-align">Buscar</h4>
                    <form action="control.do" method="post">
                          <div class="input-field">
                              <input id="codigo" type="text" name="codigo" />
                            <label for="codigo">Número de factura</label>
                        </div>
                        <button name="bt" value="4" type="submit" class="btn right">Buscar</button>
                        <br><br>
                        ${msg}
                        
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
