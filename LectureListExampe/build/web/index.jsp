

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            List<Integer> myInts = new LinkedList<>();
            myInts.add(5);
            myInts.add(7);
            myInts.add(3);
            
            
        %>
        
        
        <p style="color: blue">The list is holding <%= myInts %> right now</p>
        
        <% 
           myInts.remove(1);
           

           List<String> myStrings = new ArrayList<>();
           
           myStrings.add("hello");
           myStrings.add("world");
           myStrings.add(1, "silly");

           
         %>
         
         <p style="color: red">The list is holding <%= myInts %> right now</p>
         
         <p>the strings have <%= myStrings %> right now</p>
        
    </body>
</html>
