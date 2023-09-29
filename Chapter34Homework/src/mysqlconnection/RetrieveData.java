
package mysqlconnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


public class RetrieveData {
    private URL babyNamesSite;
    private BufferedReader br;
    private ArrayList<String[]> lines = new ArrayList<>(); //0 is id, 1 is boy name, 2 is boy count, 3 is girl name, 4 is girl count

    public RetrieveData(String babyNamesSite) {
        try {
            this.babyNamesSite = new URL(babyNamesSite);
            br = new BufferedReader(new InputStreamReader(this.babyNamesSite.openStream()));
            while(true){
                String s = br.readLine();
                if(s != null){
                    String[] names = s.split("\t");
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
