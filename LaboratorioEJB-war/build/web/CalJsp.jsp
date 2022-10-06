<%-- 
    Document   : CalJsp
    Created on : 18/09/2022, 08:49:10 PM
    Author     : Juanes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
            <form name="entrada" action="./CalServlet" method="POST">
                <div>
                <label>Numero 1: <label> 
                    <input type="text" name="val1" />
                <div/>
                <div> 
                <label>Numero 2: <label/>   
                    <input type="text" name="val2" />                
                </div>
                <div> 
                    <br>
                    <input type="submit" value="+"  name="btnSumar"/>
                    <input type="submit" value="-" name="btnRestar" />
                    <input type="submit" value="*" name="btnMultiplicar" />
                    <input type="submit" value="/" name="btnDividir"/>
                    <input type="submit" value="%" name="btnModulo"/>                
                    <input type="submit" value="^" name="btnPotencia"/>                
                <div/>
            </form>    
        </h1>
    </body>
</html>
