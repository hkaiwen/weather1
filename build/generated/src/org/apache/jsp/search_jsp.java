package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<span style=\"font-size:12px;\"><span style=\"font-size:14px;\">  \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Search Place </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/stylesheet.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/table.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("      \n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Weather</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\" action = \"weather.jsp\" method = \"post\">\n");
      out.write("          <input class=\"form-control mr-sm-2\" type=\"search\" name=\"search_place\" placeholder=\"Enter a Zipcode\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" value=\"SEARCH\">Search</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    ");
  
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
    
      out.write("  \n");
      out.write("       \n");
      out.write("    <div class=\"container\">\n");
      out.write("    <table>\n");
      out.write("            <button type=\"button\" class=\"btn btn-secondary\" Id=\"Temperature\" onclick=\"showValue()\">C/F</button>\n");
      out.write("            <button type=\"button\" class=\"btn btn-secondary\" Id=\"Temperature\" onclick=\"showValue()\">< Back</button>\n");
      out.write("            <tr>  \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Date");
                    
      out.write("  \n");
      out.write("                </th>  \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("zipcode");
                    
      out.write("  \n");
      out.write("                </th>  \n");
      out.write("                <th name=\"sheshi\"  style=\"display:none\">  \n");
      out.write("                    ");

                        out.print("Temperature(C)");
                    
      out.write("  \n");
      out.write("                </th > \n");
      out.write("                <th name=\"huashi\" >  \n");
      out.write("                    ");

                        out.print("Temperature(F)");
                    
      out.write("  \n");
      out.write("                </th > \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Visiblity(km)");
                    
      out.write("  \n");
      out.write("                </th>  \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Pressure(mb)");
                    
      out.write("  \n");
      out.write("                </th>  \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("High/Low");
                    
      out.write("  \n");
      out.write("                </th> \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Feels");
                    
      out.write("  \n");
      out.write("                </th>  \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Dew point");
                    
      out.write("  \n");
      out.write("                </th>  \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Precipitation");
                    
      out.write("  \n");
      out.write("                </th>  \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("UV Index");
                    
      out.write("  \n");
      out.write("                </th> \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Wind(km/h)");
                    
      out.write("  \n");
      out.write("                </th> \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Humidty(%)");
                    
      out.write("  \n");
      out.write("                </th> \n");
      out.write("                <th>  \n");
      out.write("                    ");

                        out.print("Descreption");
                    
      out.write("  \n");
      out.write("                </th> \n");
      out.write("            </tr>  \n");
      out.write("\n");
      out.write("            ");

                while (rs.next()) {
            
      out.write("  \n");
      out.write("            <tr>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(1));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(2));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td name=\"sheshi\"  style=\"display:none\" >  \n");
      out.write("                    ");

                        out.print(rs.getString(4));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td name=\"huashi\" >  \n");
      out.write("                    ");

                        out.print(rs.getString(5));
                    
      out.write("  \n");
      out.write("                </td> \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(6));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(7));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(8));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(9));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(10));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(11));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(12));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(13));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(14));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("                <td>  \n");
      out.write("                    ");

                        out.print(rs.getString(15));
                    
      out.write("  \n");
      out.write("                </td>  \n");
      out.write("\n");
      out.write("            </tr>  \n");
      out.write("            ");

                }
            
      out.write("  \n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function showValue() {\n");
      out.write("                var temperature = document.getElementById(\"Temperature\");\n");
      out.write("                var value = temperature.value;\n");
      out.write("                if (value == \"Temperature(F)->(C)\")\n");
      out.write("                {\n");
      out.write("                    var huashi = document.getElementsByName(\"huashi\");\n");
      out.write("                    for (i = 0; i < huashi.length; i++)\n");
      out.write("                    {\n");
      out.write("                        huashi[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    var sheshi = document.getElementsByName(\"sheshi\");\n");
      out.write("                    for (i = 0; i < sheshi.length; i++)\n");
      out.write("                    {\n");
      out.write("                        sheshi[i].style.position = \"center\"\n");
      out.write("                        sheshi[i].style.display = \"block\";\n");
      out.write("                    }\n");
      out.write("                    temperature.value = \"Temperature(C)->(F)\"\n");
      out.write("                } else {\n");
      out.write("                    var huashi = document.getElementsByName(\"huashi\");\n");
      out.write("                    for (i = 0; i < huashi.length; i++)\n");
      out.write("                    {\n");
      out.write("                        huashi[i].style.position = \"center\"\n");
      out.write("                        huashi[i].style.display = \"block\";\n");
      out.write("                    }\n");
      out.write("                    var sheshi = document.getElementsByName(\"sheshi\");\n");
      out.write("                    for (i = 0; i < sheshi.length; i++)\n");
      out.write("                    {\n");
      out.write("                        sheshi[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                    temperature.value = \"Temperature(F)->(C)\"\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

            rs.close();
            statement.close();
            conn.close();
        
      out.write("  \n");
      out.write("    </body>  \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
