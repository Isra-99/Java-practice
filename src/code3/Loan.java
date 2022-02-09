package code3;

import java.util.Scanner;

public class Loan {
    public static void main(String args[]){
        int income = 30000;
        int work_exp = 2;
        Scanner scanner  =  new Scanner(System.in);
        System.out.println(" what is your basic income?");
        int inc = scanner.nextInt();
        System.out.println(" How much do you have working exereonces in years???");
        int we=scanner.nextInt();
        if (inc >= income)
        {
            if ( we >= work_exp )
            {
                System.out.println(" You are qualified for the loan");
            }
            else
            {
                System.out.println(" Your working expereince must be "+ work_exp + " years to qualify for the loan");

            }
        }
        else
        {
            System.out.println(" You are not qualified for the loan because your salary must be atleat " + income);
        }

    }
}
