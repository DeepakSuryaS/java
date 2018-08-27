package person;

import static person.HairColor.*;

public class Person {
    
    HairColor hairColor = PINK;
    
    public Person() {
        
    }
    
    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        peterParker.hairColor = BLACK; //changing pete's hair color will change spidey's and vice versa
        System.out.println("Hair color of Peter Parker : " + peterParker.hairColor);
        System.out.println("Hair color of Spiderman : " + spiderMan.hairColor);
    }

    
}
