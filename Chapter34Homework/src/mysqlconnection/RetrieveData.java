
package mysqlconnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;


public class RetrieveData {
    private URL babyNamesSite;
    private BufferedReader dataStream;
    private ArrayList<String[]> lines = new ArrayList<>(); //0 is id, 1 is boy name, 2 is boy count, 3 is girl name, 4 is girl count

    public RetrieveData(String babyNamesSiteString) {
        try {
            // URL constructors were deprecated last Sunday 9-24-2023, type still exists, but need instantiated this way
            //this.babyNamesSite = new URL(babyNamesSiteString);
            this.babyNamesSite = URI.create(babyNamesSiteString).toURL();
            dataStream = new BufferedReader(new InputStreamReader(this.babyNamesSite.openStream()));
            while(true){
                String nextLine = dataStream.readLine();
                if(nextLine != null){
                    String[] names = nextLine.split("\t");
                    for(int i=0; i<names.length; i++){
                        names[i] = names[i].trim();
                    }
                    lines.add(names);
                }
                else{
                    break;
                }
            }
        } catch (Exception ex) {
        }
    }//end constructor

    public ArrayList<String[]> getLines() {
        return lines;
    }

}//end RetrieveData class
