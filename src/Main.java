import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("How much did you receive the money ($)? ");
        a = sc.nextInt();
        int k = (int)(a*(75/100.0f));

        System.out.println("Book and Supplies: " +k);


    }
}