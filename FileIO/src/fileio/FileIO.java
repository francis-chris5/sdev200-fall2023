
package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args){
        String s1 = new String("here is a string to write to a file.");
        File stringFile = new File("stringFile1.txt");
        
        try{
            PrintWriter writer = new PrintWriter(stringFile);
            writer.println(s1);
            writer.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println("the file's not there... or we don't write access..");
        }
        
        String stuffFromFile = new String();
        try{
            Scanner fromFile = new Scanner(stringFile);
            while(true){
                stuffFromFile += fromFile.next();
            }
            
//            while(fromFile.hasNext()){
//                stuffFromFile = fromFile.next();
//            }
  
        }
        catch(Exception e){
        }
        finally{
            System.out.println(stuffFromFile);
        }
        
        
        MyData data = new MyData(45, "forty-five", true);
        File streamFile = new File("myFile.arbritrary");
        
        try{
            FileOutputStream fos = new FileOutputStream(streamFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(streamFile));
            
            oos.writeObject(data);
            oos.close();
            fos.close();
        }
        catch(FileNotFoundException fnfe){
        }
        catch(IOException ioe){
        }
        catch(Exception e){
            System.out.println("couldn't write to a file");
            e.getMessage();
        }
        
        
        try{
            FileInputStream fis = new FileInputStream(streamFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyData fileData = (MyData)ois.readObject();
            System.out.println(fileData + " along with " + fileData.getMyWords());
            ois.close();
            fis.close();
        }
        catch(FileNotFoundException fnfe){
        }
        catch(IOException ioe){
        }
        catch(ClassNotFoundException cnfe){
        }
        catch(Exception e){
            System.out.println("couldn't write to a file");
            e.getMessage();
        }
        
    }
    
}
