
package mysqlconnection;

import java.sql.*;

public class DatabaseConnector {
    private String url;
    private String username;
    private String password;

    public DatabaseConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }//end constructor()
    
    public int createDatabase(){
        String query = "CREATE DATABASE IF NOT EXISTS BabyNames;";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }//end createDatabase()
    
    
    public int createBoyTable(){
        String query = "CREATE TABLE IF NOT EXISTS Boys(";
        query += "personID INTEGER PRIMARY KEY AUTO_INCREMENT, ";
        query += "name VARCHAR(64), ";
        query += "count INTEGER);";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }//end createBoyTable()
    
    
    public int createGirlTable(){
        String query = "CREATE TABLE IF NOT EXISTS Girls(";
        query += "personID INTEGER PRIMARY KEY AUTO_INCREMENT, ";
        query += "name VARCHAR(64), ";
        query += "count INTEGER);";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }//end createGirlTable()
    
    
    public int insertBoyData(String name, int count){
        String query = "INSERT INTO Boys(name, count) VALUES(";
        query += "\""+name+"\", "+count+");";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }//end insertBoyData() 
    
    
    public int insertGirlData(String name, int count){
        String query = "INSERT INTO Girls(name, count) VALUES(";
        query += "\""+name+"\", "+count+");";
        int result;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }//end insertGirlData   
}//end DatabaseConnector class
