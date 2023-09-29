
package mysqlconnection;

//default XAMP mysql access: u: root, p: ""

import java.util.ArrayList;

public class MySQLConnection {

    private static final String serverURL = "jdbc:mysql://localhost:3306";
    private static final String url = "jdbc:mysql://localhost:3306/babynames";
    private static String username = "root";
    private static String password = "";
    
            
    public static void main(String[] args) {
        int result;
        
        DatabaseConnector initialConnector = new DatabaseConnector(serverURL, username, password);
        result = initialConnector.createDatabase();
        System.out.println(result);
        
        DatabaseConnector normalConnector = new DatabaseConnector(url, username, password);
        result = normalConnector.createBoyTable();
        System.out.println(result);
        result = normalConnector.createGirlTable();
        
        RetrieveData retrieveData = new RetrieveData("https://liveexample.pearsoncmg.com/data/babynamesranking2008.txt");
        ArrayList<String[]> lines = retrieveData.getLines();
        lines.forEach(e -> {
            normalConnector.insertBoyData(e[1], Integer.parseInt(e[2]));
            normalConnector.insertGirlData(e[3], Integer.parseInt(e[4]));
        });
        
    }//end main()
    
}//end MySQLConnection class
