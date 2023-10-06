
package payroll;

import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class EmployeeStack {
    private String name;
    private double rate;
    private double hours;
    private EmployeeStack next = null;
    private boolean empty = true;

    public EmployeeStack() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public boolean isEmpty() {
        return empty;
    }
    
    
    
    public void push(EmployeeStack es){
        EmployeeStack current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = es;
        this.empty = false;
    }
    
    public void pop(EmployeeStack es){
        EmployeeStack current = es;
        EmployeeStack top = es;
        if(current.next != null){
            while(current.next != null){
                top = current;
                current = current.next;
            }
            current.toCheck();
            top.next = null;
        }
        else{
            current.toCheck();
            current.empty = true;
        }
    }
    
    
    public void toCheck(){
        double pay;
        DecimalFormat df = new DecimalFormat("0.00");
        if(this.hours > 40){
            pay = (this.hours - 40) * 1.5 * this.rate + 40 * this.rate;
        }
        else{
            pay = this.hours * 40;
        }
        
        String statement = "Pay to the order of " + this.name + "\nAmount: " + df.format(pay);
        
        File check = new File(this.name + ".chk");
        try{
            PrintWriter pw = new PrintWriter(check);
            pw.println(statement);
            pw.close();
        }
        catch(Exception e){
        }
    }
    
}
