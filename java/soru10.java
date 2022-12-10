import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {

        // kitle indeksini hesaplayan program

        // beden kitle indeksi = kilo / ( boy * boy )

        Scanner input = new Scanner(System.in);


        System.out.println(" kilonuzu girin ");
        float kilo = input.nextFloat();

        System.out.println(" boyunuzu girin ");
        float boy = input.nextFloat();

        float bki = kilo / ( boy * boy );

        System.out.println(" beden kitle indeksi = " + bki );

        if (bki < 18 ){
            System.out.println(" zayıf ");
        } else if (bki< 25 ) {
            System.out.println(" normal ");
        } else if (bki < 30 ) {
            System.out.println(" hafif şişman ");
        } else if (bki < 35 ) {
            System.out.println( " şişman ");
        }else System.out.println(" obez ");
    }

    }