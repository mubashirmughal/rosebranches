import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("How much money did you receive ($)? ");
        a = sc.nextInt();
        int k = (int)(a*(75/100.0f));

        System.out.println("Book and Supplies: " +k);

        int remainingMoney = a-k;
        System.out.println("Remaining Money : " +remainingMoney);

        int coffee = (remainingMoney / 3) / 2;
        int fcomp = (remainingMoney / 3) / 4;
        int subticket = (remainingMoney / 3) / 3;
        double r = a * 0.005 ;

       System.out.println("you can then buy:\n" + coffee + " coffees \n"  + fcomp + " Flash Computer Numbers\n" + subticket + " Subway Tickets\n" + r + " remaining ");

    }
}

