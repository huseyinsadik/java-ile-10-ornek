import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
         // kullancı tarafından girilen sayı 3`ün katlarından olup olmadığını hesaplayan program

        Scanner input = new Scanner(System.in);

        System.out.println(" bir sayı girin ");
        int sayı = input.nextInt();

        if ( sayı % 3 == 0 ){
            System.out.println(" girilen sayı 3`ün katlarıdır ");
        }else System.out.println("girilen sayı 3`ün katı değildir ");

    }
}
