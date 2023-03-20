
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen boyunuzu m cinsinden giriniz:");
        double boy=scanner.nextDouble();
        System.out.println("lutfen kilonuzu kg cinsinden giriniz giriniz:");
        double kilo=scanner.nextDouble();
       double sonuc=kilo/(boy*boy);
        System.out.println("vucut kitle endeksiniz: " + sonuc);
    }
}
