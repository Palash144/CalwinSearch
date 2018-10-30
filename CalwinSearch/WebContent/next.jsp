<!DOCTYPE html>
<%@page import="org.springframework.ui.ModelMap"%>
<%@page import="com.jarvis.entity.Report"%>
<%@page import="java.util.List"%>
<%@page import="com.codoid.products.fillo.Recordset"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Page Title</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
  <script src="main.js"></script>
  <title>Search</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
  </script>
  <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
  rel = "stylesheet">

  <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
  <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
    $(function() {
      $( "#datepicker-12" ).datepicker();

    });
    $(function() {
      $( "#datepicker-13" ).datepicker();

    });
    $(function() {
        $( "#datepicker-14" ).datepicker();

      });
    $(function() {
        $( "#datepicker-15" ).datepicker();

      });
  </script>
  <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<%
List<Report> record=(List<Report>)session.getAttribute("report");
Exception e=null;
e=(Exception)session.getAttribute("error");
%>

</head>
<body>
<form action="getdata.do" method="post" id="Search">
  <table>
     <h3>Search criteria</h3>
    <tr>
      <td>
        <b id="text_field">Report Id</b>
        <input type="text" name="reportid" id="text_box" placeholder="Enter Report Id">
      </td>
      <td>
        <b id="text_field" >Report Name</b>
        <input type="text" name="reportname" id="text_box" placeholder="Enter Report Name">
      </td>

    </tr>
    <tr>
      <td>
        <b id="text_field" >Report Category</b>
        <select id="text_box" name="category">
          <option value="" >Category 1</option>
          <option value="">Category 2</option>
          <option value="">Category 3</option>
          <option value="">Category 4</option>
        </select>
      </td>
      <td>
        <b id="text_field" >Run Date Between</b>
        <input type = "text" name="rundatefrom" id = "datepicker-12" placeholder="From"><span class="glyphicon glyphicon-calendar">
          <b id="text_field">-</b>
          <input type = "text" name="rundateto" id = "datepicker-13" placeholder="to"><span class="glyphicon glyphicon-calendar">
          </td>

        </tr>
        <tr>
          <td><b id="text_field">Report Keyword</b>
            <input type="text" name="report_id" id="text_box" placeholder="Report Keyword">
          </td>
          <td>
            <b id="text_field">Report Period Between</b>
            <input type = "text" id = "datepicker-14" placeholder="From"><span class="glyphicon glyphicon-calendar">
              <b id="text_field">-</b>
              <input type = "text" id = "datepicker-15" placeholder="to"><span class="glyphicon glyphicon-calendar">
              </span>    
            </td>
          </tr>
          <tr>
            <td></td>
            <td align="right">
              <button type="submit">Apply</button>
              <input type="reset" value="Reset">
            </td>

            </tr>
          </table>
          </form>
          
          <h3>DATA</h3> <%if(e!=null){%>
        	 Report Id does not Exist 
          <%}%>
<table>
  <tr>
    <th>Report Id</th>
    <th>Report Name</th>
    <th>Report Category</th>
    <th>Run Date</th>
    <th>Report Date</th>
    <th>Report Keyword</th>
  </tr>
 <%for(Report rep : record ){ %>
  <tr>
    <td><%=rep.getReportid()%></td>
    <td><%=rep.getReportname()%></td>
    <td><%=rep.getCategory()%></td>
    <td><%=rep.getRundate()%></td>
    <td><%=rep.getReportdate()%></td>
    <td><%=rep.getReportkeyword()%></td>
  </tr>
<%} %>
</table>
        </body>
        </html>