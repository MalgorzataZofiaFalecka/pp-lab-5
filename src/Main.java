import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", 25);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        Messenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Hello, this is a test email!");


    }
}
