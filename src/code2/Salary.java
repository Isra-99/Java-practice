package code2;

import java.util.Scanner;

public class Salary {
    public static void main(String args[]){
        int salary = 1000;
        int bonus = 250;
        int quote = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of sales employee made this week? ");
        int sales = scanner.nextInt();
        scanner.close();
        if (sales >= quote )
        {
             System.out.println("COngrats you recieved a bpnus !!!");
        }
        else
        {
            sales = quote-sales;
            System.out.println(" you were short of " + sales + " sales" );
        }



    }
}
