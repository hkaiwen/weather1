<%-- 
    Document   : changepass
    Created on : May 3, 2018, 8:38:12 PM
    Author     : kaiwen
--%><%@page import="loginfiles.Encrypttest"%>

<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="container">
            <a href="index.jsp">Login</a>
        </div>
        <%
            String psw = request.getParameter("oldpass");
            String npss = request.getParameter("newpass");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/weather.com", "root", "qscesz123");
            Statement stmt = con.createStatement();
            String user = session.getAttribute("Username").toString();
            ResultSet type = stmt.executeQuery("select password from users where Username = '"+user+"'");
            String pass="";
            while(type.next()) {
                pass = type.getString(1);
            }   
            pass = Encrypttest.decrypt(pass);
            if ( pass.equals(psw)) {
                out.print("Successfully changed password");
                String encryptedkey = Encrypttest.encrypt(npss);
                int i=stmt.executeUpdate("update users set password='"+encryptedkey+"' where Username='"+user+"'");
            }
            else {
                out.print("pass word does not match");
            }
            %>
    </body>
</html>
