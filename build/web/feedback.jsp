<%-- 
    Document   : feedback
    Created on : Apr 17, 2018, 1:11:38 PM
    Author     : Yunfan
--%>


<%@page import="java.text.SimpleDateFormat"%>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%@ page import ="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/table.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container">
      <a class="navbar-brand" href="#">Weather</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="changepass.html">Change Password <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="index.jsp">Log Out</a>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0" action = "weather.jsp" method = "post">
          <input class="form-control mr-sm-2" type="search" name="search_place" placeholder="Enter a Zipcode" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit" value="SEARCH">Search</button>
        </form>
      </div>
      </div>
    </nav>
        <%
            String user=session.getAttribute("Username").toString(); 
            String newtext=request.getParameter("newtext"); 
            String zip=session.getAttribute("zip").toString();
            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/weather.com", "root", "qscesz123");
            Statement stmt = con.createStatement();
            String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            String time = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
            //ResultSet rs = 
                    //stmt.executeQuery("select * from feedback where Zipcodefe = '"+zip+"'");
            int i=stmt.executeUpdate("insert into feedback values ('"
               +user+"','"+date+"','"+time+"','"+newtext+"','"+Integer.parseInt(zip)+"')");
            
             
        %>
        <div class="container">
        <a href="search.jsp" align="center">Go back to search</a>
        </div>
    </body>
</html>
