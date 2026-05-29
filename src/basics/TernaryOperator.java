package src.basics;
import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println(age<18?"Not an Adult.":"An Adult");

        sc.close();
    }  
}
