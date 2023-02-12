import java.util.Scanner;
public class Wanting_numbers {
    public static void main (String[] args) {
        int k;
        int total = 0 ;
        Scanner inp = new Scanner(System.in);

        do {
             System.out.println("Bir sayı giriniz : ");
             k = inp.nextInt();
             if (k%2==0 && k%4==0) total = total + k;

        } while (k%2 == 0);

            System.out.println("Toplam = "+total);
    }
}
