import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double urunFiyati, kdvliFiyati, kdv = 0.18;

        System.out.print("Urun Fiyatini Giriniz:");
        urunFiyati = input.nextDouble();

        kdv = (urunFiyati * kdv);
        System.out.println("KDV'li Urun Fiyati :" + (urunFiyati + kdv));

    }
}