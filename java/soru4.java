import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        // girilen N sayıya kadar olan tüm tam sayıların toplamı hesaplayan program

        Scanner input = new Scanner(System.in);

        System.out.println(" bir sayı girin ");
        int N = input.nextInt();

        int i = 0 ;
        int toplam = 0 ;

        for(i = 0 ; i <= N ; i ++){
            toplam = toplam + i ;

        }
        System.out.println(N + " sayıya kadar olan bütün sayıların toplamı = " + toplam );

    }
}
