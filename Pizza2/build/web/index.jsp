

<%@page import="java.util.LinkedList"%>
<%@page import="pizza.pie.Pie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
//          LinkedList<Pie> pies = new LinkedList<>();
//          double price = 0.0;
          

        %>
        
        <form action="receipt.jsp" method="GET">
            <p> 
                Speciatly or custom pizza: 
                <input type="text" name="pizzatype"/>
            <p> 
                
            <p> if specialty which one (hawaiian or supreme)? 
                <input type="text" name="specialty"/>
            </p>
            
            <p>
                if custom which one topping do you want:
                <input type="text" name="topping"/>
            </p>
            
            <p><input type="submit" value="Place Order"></p>
            
        </form>
    </body>
</html>
