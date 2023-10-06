
package payroll;

public class Payroll {

    public static final String url = "jdbc:mysql://localhost:3306/Payroll";
    public static final String username = "root";
    public static final String password = "";
    
    
    public static void main(String[] args) {
        new GetData(url, username, password);
    }
}
