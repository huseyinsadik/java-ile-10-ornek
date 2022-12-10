import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {

        // kullanıcı tarafından girilen iki sayının değerlerini değeştirme

        Scanner input = new Scanner(System.in);

        System.out.println(" birinci sayı girin ");
        int sayı1 = input.nextInt();

        System.out.println(" ikinci sayı girin ");
        int sayı2 = input.nextInt();

        int geçiş = sayı1 ;
        sayı1 = sayı2 ;
        sayı2 = geçiş ;

        System.out.println(" birinci sayı = " + sayı1);
        System.out.println(" ikinci sayı = " + sayı2  );

    }
}
