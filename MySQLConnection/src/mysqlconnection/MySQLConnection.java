
package mysqlconnection;

//default XAMP mysql access: u: root, p: ""

import java.util.LinkedList;

public class MySQLConnection {

    private static final String serverURL = "jdbc:mysql://localhost:3306";
    private static final String url = "jdbc:mysql://localhost:3306/people";
    private static String username = "root";
    private static String password = "";
    
            
    public static void main(String[] args) {
        int result;
        
//        DatabaseConnector initialConnector = new DatabaseConnector(serverURL, username, password);
//        result = initialConnector.createDatabase();
//        System.out.println(result);
        
        DatabaseConnector normalConnector = new DatabaseConnector(url, username, password);
//        result = normalConnector.createPeopleTable();
//        System.out.println(result);
        
        
//        Record[] data = {
//            new Record("Sally", 12, "Salem"),
//            new Record("Mary", 44, "Marysville"),
//            new Record("Alan", 22, "New Albany"),
//            new Record("Corey", 33, "Corydon"),
//            new Record("Chuck", 19, "Charlestown"),
//        };
//        
//        result = 0;
//        for(Record r : data){
//            result += normalConnector.insertData(r.getName(), r.getAge(), r.getTown());
//        }
//        System.out.println(result);

        LinkedList<Record> data = normalConnector.getData("Person", new String[]{"name", "town"}, "age > 30");
        System.out.println(data);



    }//end main()
    
}//end MySQLConnection class
