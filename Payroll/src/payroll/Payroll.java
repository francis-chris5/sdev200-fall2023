
package payroll;

public class Payroll {

    public static final String url = "jdbc:mysql://localhost:3306/Payroll";
    public static final String username = "root";
    public static final String password = "";
    
    
    public static void main(String[] args) {
        long start = System.nanoTime();
        GetData data = new GetData(url, username, password);
        
        EmployeeStack stack = data.getPayrollStack();
        
        while(!stack.isEmpty()){
            stack.pop(stack);
        }
        
        long end = System.nanoTime();
        System.out.println((end-start));
    }
}
