
package payroll;

import java.sql.*;

public class GetData {
    private String url;
    private String username;
    private String password;

    public GetData(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        
        EmployeeStack stack = this.getPayrollStack();
        
        while(!stack.isEmpty()){
            stack.pop(stack);
        }
    }
    
    
    public EmployeeStack getPayrollStack(){
        EmployeeStack stack = new EmployeeStack();
        String query = "SELECT Employee.name, Employee.rate, Hours.hoursWorked FROM Employee JOIN Hours WHERE Employee.employeeID = Hours.employeeID;";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(query);
            
            while(results.next()){
                EmployeeStack temp = new EmployeeStack();
                temp.setName(results.getString(1));
                temp.setRate(results.getFloat(2));
                temp.setHours(results.getFloat(3));
                stack.push(temp);
            }
            
            stmt.close();
            conn.close();
        }
        catch(Exception e){
        }
        
        return stack;
    }
}
