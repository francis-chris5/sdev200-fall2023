
<%@page import="pizza.toppings.GreenPepper"%>
<%@page import="pizza.pie.Custom"%>
<%@page import="pizza.pie.Supreme"%>
<%@page import="pizza.pie.Crust"%>
<%@page import="pizza.pie.Hawaiian"%>
<%@page import="java.text.DecimalFormat"%>
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
            LinkedList<Pie> pies = new LinkedList<>();
            double price = 0.0;
            DecimalFormat df = new DecimalFormat("0.00");

            String pizzaType = request.getParameter("pizzatype");
            String specialty = request.getParameter("specialty");
            String topping = request.getParameter("topping");
            
            String outMessage = "";
            

            if(pizzaType.equals("specialty")){
                
                if(specialty.equals("hawaiian")){
                    Pie nextPie = new Hawaiian();
                    
                    nextPie.setCrust(Crust.DEEP_DISH);
                    pies.add(nextPie);
                }
                else if(specialty.equals("supreme")){
                    Pie nextPie = new Supreme();
                    
                    nextPie.setCrust(Crust.DEEP_DISH);
                    pies.add(nextPie);
                }
                else if(specialty.equals("")){
                }
                else{                
                }
            }
            else{
                Pie nextPie = new Custom();
                
                if(!topping.equals("greenpepper")){
                    outMessage = "sorry we're out of that topping you can have green peppers";
                }
                else{
                
                    nextPie.addTopping(new GreenPepper());
                    nextPie.setCrust(Crust.DEEP_DISH);
                    pies.add(nextPie);
                }
            }

        
       
        
        for(int i=0; i< pies.size(); i++){
            price += pies.get(i).total();
        }
        
            String totalPrice = df.format(price);
            
        %>
        
        
        
        <p><%= outMessage %></p>
        <p> so that's going to be <%= pies %> </p>
        <p>for a total of <%= totalPrice %> </p>
        

    </body>
</html>
