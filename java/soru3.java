import java.nio.file.LinkPermission;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        // dikdörtgenin çevresini ve alanını hesaplayan program

        // dikdörtgenin çevresi = 2 * (uzunluk + en )
        // dikdörtgenin alanı = uzunluk * en

        Scanner input = new Scanner(System.in);

        System.out.println(" dikdörtgenin uzunluk değerini girin ");
        int uzunluk = input.nextInt();

        System.out.println("dikdörtgenin en değerini girin ");
        int en = input.nextInt();

        int çevre = 2 * (uzunluk + en );
        int alan =  uzunluk * en;

        System.out.println(" dikdörtgenin alanı = " + alan);
        System.out.println(" dikdörtgenin çevresi = " + çevre );

    }
}
