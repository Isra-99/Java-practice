package code5;

import java.util.Scanner;

public class CreditCheck {
    public static void main(String arg[]){
        System.out.println(" Enter your income");
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();
        System.out.print("What is you credit");
        int cr= scanner.nextInt();
        instantCredit(income,cr);

    }
    public static void instantCredit( int salary, int creditScore){
        int maxIncome = 25000;
        int credit = 700;
        if ( salary < maxIncome && creditScore<700)
        {
            System.out.println(" You are rehected !!!");
        }
        else {
            System.out.println(" here is your check !!!");

        }


    }
}
