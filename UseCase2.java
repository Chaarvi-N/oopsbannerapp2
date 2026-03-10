import java.util.Scanner;

public class UseCase2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userInput = sc.nextLine();

        System.out.println("Hello " + userInput + "!" );
        
        sc.close();
    }
}
