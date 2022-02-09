package newcode;
import java.util.Scanner;
public class GrossSal {
    public static void main(String arg[]){
        System.out.println(" Enter season of the year ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        System.out.println("Enter the whole numner");
        int whole = scanner.nextInt();
        System.out.println(" enter the adjective");
        String adj = scanner.next();
        scanner.close();

        System.out.println(" ON a " + adj + "  " + season + " day,i drink " + whole + "  number of  coffee" );

    }
}
