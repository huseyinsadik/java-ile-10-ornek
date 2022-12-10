import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

        // kullancı tarafından girilen sayının faktöryelini hesablan program

        Scanner input = new Scanner(System.in);

        System.out.println(" faktöryelini hesaplamak istediğiniz sayıyı girin ");
        int sayı = input.nextInt();


        int i = 1 ;
        int faktöriyel = 1 ;
        for (i = 1 ; i <= sayı ; i++ ){
            faktöriyel = faktöriyel * i ;
        }
        System.out.println( sayı + " ! " + " = " + faktöriyel );

    }
}
