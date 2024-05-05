import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Emma", 35);
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
            
            int num1 = 15;
            int num2 = 7;
            int sum = MathUtils.add(num1, num2);

            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

            EmailMessenger emailMessenger = new EmailMessenger();
            String message = "The sum of " + num1 + " and " + num2 + " is: " + sum;
            emailMessenger.sendMessage(message); }
        
        
        catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        Messenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Hello, this is a test email!");


    }
}
