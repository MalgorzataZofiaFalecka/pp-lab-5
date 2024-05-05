import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5]; 
        final int b = 10; 
        

        try {
            people[0] = new Person("Jan Kowal", 30);
            people[1] = new Person("Mike Wazowski", 25);
            people[2] = new Person("Bob Nowak", 40);
            people[3] = new Person("Emma Stone", 35);
            people[4] = new Person("Michał Nowicki", 45);

            for (Person person : people) {
                if (person != null) { 
                    int age = person.getAge();
                    int value = MathUtils.add(age, b);
                    String message = person.getName() + " age value: " + value;
                    
                    EmailMessenger emailMessenger = new EmailMessenger();
                    emailMessenger.sendMessage(message);
                }
            }


        }

        



        catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        Messenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Hello, this is a test email!");


    }
}
