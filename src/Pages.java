import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.print(age + "-year olds should read at least " + (100 - age) + " pages before giving up.");

    }
}
