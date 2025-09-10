import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.print(age + "-year olds should date somebody who is at least " + (7+age/2) + " years old.");
    }
}
