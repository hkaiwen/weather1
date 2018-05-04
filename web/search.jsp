<%--
    Document   : search
    Created on : Apr 3, 2018, 5:15:24 PM
    Author     : kaiwen wyh
--%>

<!DOCTYPE html>
<span style="font-size:12px;"><span style="font-size:14px;"><%@ page language="java" import="java.sql.*,java.io.*,java.util.*"%>
<%@ page contentType="text/html;charset=utf-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/stylesheet.css">
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
        String DBDRIVER = "com.mysql.jdbc.Driver";
        String DBUSER = "root";
        String DBPASS = "qscesz123";
        String DBURL = "jdbc:mysql://localhost:3306/weather.com" ;
        Connection conn=null;
        Class.forName(DBDRIVER);
        conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM " + "daily_values";
        ResultSet rs = statement.executeQuery(sql);
    %>

    <div class="container">
    <table>
            <button type="button" class="btn btn-secondary" Id="Temperature" onclick="showValue()">C/F</button>
            <button type="button" style="float:right" class="btn btn-secondary" Id="Temperature" onclick="goBack()">< Back</button>
            <tr>
                <th><% out.print("Date"); %> </th>
                <th><% out.print("zipcode");%></th>
                <th><%out.print("Time");%></th>
                <th name="sheshi" ><%out.print("Temperature(C)");%></th>
                <th name="huashi" style="display:none"><%out.print("Temperature(F)");%></th>
                <th><%out.print("Visiblity(km)");%></th>
                <th><%out.print("Pressure(mb)");%></th>
                <th><%out.print("High/Low");%> </th>
                <th><%out.print("Feels");%></th>
                <th><%out.print("Dew point");%></th>
                <th><%out.print("Precipitation");%></th>
                <th><%out.print("UV Index");%> </th>
                <th><%out.print("Wind(km/h)");%></th>
                <th><%out.print("Humidty(%)");%></th>
                <th><%out.print("Description");%></th>
            </tr>
            <%
                while (rs.next()) {
            %>
            <tr>
                <td><%out.print(rs.getString(1));%></td>
                <td><%out.print(rs.getString(2));%></td>
                <td><%out.print(rs.getString(3));%></td>
                <td name="sheshi"  ><%out.print(rs.getString(4));%></td>
                <td name="huashi" style="display:none"><%out.print(rs.getString(5));%></td>
                <td><%out.print(rs.getString(6));%></td>
                <td><%out.print(rs.getString(7));%></td>
                <td><%out.print(rs.getString(8));%></td>
                <td><%out.print(rs.getString(9));%></td>
                <td><%out.print(rs.getString(10));%></td>
                <td><%out.print(rs.getString(11));%></td>
                <td><%out.print(rs.getString(12));%></td>
                <td><%out.print(rs.getString(13));%></td>
                <td><%out.print(rs.getString(14));%></td>
                <td><%out.print(rs.getString(15));%></td>
            </tr>
            <%
                }
            %>
        </table>
    </div>
        <script type="text/javascript">
            function showValue() {
                var temperature = document.getElementById("Temperature");
                var value = temperature.value;
                if (value == "Temperature(F)->(C)")
                {
                    var huashi = document.getElementsByName("huashi");
                    for (i = 0; i < huashi.length; i++)
                    {
                        huashi[i].style.display = "none";
                    }

                    var sheshi = document.getElementsByName("sheshi");
                    for (i = 0; i < sheshi.length; i++)
                    {
                        sheshi[i].style.position = "center"
                        sheshi[i].style.display = "block";
                    }
                    temperature.value = "Temperature(C)->(F)"
                } else {
                    var huashi = document.getElementsByName("huashi");
                    for (i = 0; i < huashi.length; i++)
                    {
                        huashi[i].style.position = "center"
                        huashi[i].style.display = "block";
                    }
                    var sheshi = document.getElementsByName("sheshi");
                    for (i = 0; i < sheshi.length; i++)
                    {
                        sheshi[i].style.display = "none";
                    }
                    temperature.value = "Temperature(F)->(C)"
                }


            }
        </script>
        <%
            rs.close();
            statement.close();
            conn.close();
        %>
    </body>
</html>
