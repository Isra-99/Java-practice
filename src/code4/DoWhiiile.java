package code4;

import java.util.Scanner;

public class DoWhiiile {
    public static void main(String arg[]) {
        int students = 24;
        int tests =4;
        double total = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<=students ; i++)
        {
            for (int j = 1; j<=tests ; j++)
            {
                System.out.println(" Score of "+ j+ " test ");
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/students;
            System.out.println(" so the average score of "+ (i+1) + "th student is " + average);


        }


    }
}
