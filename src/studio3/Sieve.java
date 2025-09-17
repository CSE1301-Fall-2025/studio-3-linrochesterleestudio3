import java.util.Scanner;

public class Sieve {

    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);
            System.out.println("Choose a number 'n' that is greater than 20 but less than 31.");
            int n = in.nextInt();
            int[ ] sieveNumbers = new int[n];
            for (int i = 0; i < sieveNumbers.length; i++) {
                sieveNumbers[i] = i;
            }

            for (int i = 0; i < sieveNumbers.length; i += 2) {
                sieveNumbers[i] = i;
            }

            for (int i = 0; i < sieveNumbers.length; i += 2) {
                System.out.println(sieveNumbers [i]);
            }
            
}
}
