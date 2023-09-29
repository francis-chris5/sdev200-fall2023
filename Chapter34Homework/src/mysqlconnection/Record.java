
package mysqlconnection;


public class Record {
    private int personID;
    private String name;
    private int count;

    public Record() {
    }

    public Record(int personID, String name, int count) {
        this.personID = personID;
        this.name = name;
        this.count = count;
    }

    public Record(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "Record{" + "personID=" + personID + ", name=" + name + ", age=" + count + '}';
    }
    
    
    
    
}
