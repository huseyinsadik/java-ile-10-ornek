import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // girilen iki sayı bir birine göre durumunu iceleyen program

        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayı girin");
        int sayı1 = input.nextInt();

        System.out.println(" ikinci sayı girin ");
        int sayı2 = input.nextInt();

        if (sayı1 > sayı2 ){
            System.out.println(" birinci sayı büyüktür " + sayı1);
        } else if (sayı1<sayı2) {
            System.out.println(" ikinci sayı büyüktür " + sayı2 );
        }else System.out.println(" sayılar bir birine eşittir " + sayı2);

    }
}
