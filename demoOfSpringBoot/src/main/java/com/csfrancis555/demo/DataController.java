
package com.csfrancis555.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    
    @RequestMapping({"/", "/home"})
    public List<Person> showAllPeople(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Sally", 22, "Salem"));
        people.add(new Person("Charlie", 37, "Chralestown"));
        people.add(new Person("Alan", 82, "New Albany"));
        people.add(new Person("Mary", 14, "Marysville"));
        people.add(new Person("Corey", 25, "Corydon"));
        people.add(new Person("Shelly", 65, "Sellersburg"));
        
        return people;
    }
}
