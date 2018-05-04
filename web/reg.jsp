<%-- 
    Document   : reg
    Created on : Apr 16, 2018, 2:50:17 PM
    Author     : kaiwen
--%>
<%@page import="loginfiles.Encrypttest"%>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>e
    <body>
        <h1>Hello World!</h1>
        <%
            String user=request.getParameter("userid"); 
            session.setAttribute("userid",user); 
            String pwd=request.getParameter("pwd"); 
            String fname=request.getParameter("fname"); 
            String lname=request.getParameter("lname"); 
            String email=request.getParameter("email"); 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/weather.com", "root", "qscesz123");
            String encryptedkey = Encrypttest.encrypt(pwd);
            Statement stmt = con.createStatement();
            ResultSet rs = 
                    stmt.executeQuery("select * from users where Username = '"+user+"'");
            if (rs.next()) {
                out.println("User already exist!");
            }
            else {
                int i=stmt.executeUpdate("insert into users values ('"
                    +user+"','"+encryptedkey+"', 'visit','"+email+"',	'"+fname+"','"+lname+"')"); 
                out.println("Successful Registered");
            }
             
        %>
        <a href ="reg.html">Back</a><br/><br/>
        <a href="index.jsp">Login</a>
    </body>
</html>
