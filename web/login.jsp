<%-- 
    Document   : login
    Created on : Apr 16, 2018, 2:07:55 PM
    Author     : kaiwen
--%>
<%@page import="loginfiles.Encrypttest"%>
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
        <%
            String Username = request.getParameter("uname");
            session.setAttribute("Username", Username);
            String psw = request.getParameter("pass");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/weather.com", "root", "qscesz123");
            Statement stmt = con.createStatement();
            ResultSet rs = 
                    stmt.executeQuery("select * from users where Username = '"+Username+"'");
            if(rs.next()) {String pass = rs.getString(2);
                pass = Encrypttest.decrypt(pass);
                if(pass.equals(psw)){  
                    response.sendRedirect("search.jsp"); 
                } 
                else { 
                    out.println("Invalid password try again"); 
                } 
            } 
            else 
            %>
            <a href="index.jsp">Back to login</a>
    </body>
</html>
