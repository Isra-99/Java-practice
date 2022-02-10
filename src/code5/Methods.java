package code5;

import java.util.Scanner;

public class Methods {
    public static void main(String arg[]){
        System.out.println(" what is your name");
        Scanner scanner  = new Scanner(System.in);
        String name = scanner.next();
        display(name);

    }
    public static void display ( String name){
        System.out.println(" nice to meet you  " + name );
    }
}
