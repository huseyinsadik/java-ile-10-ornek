import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {

        // kullancı tarafından girilen sayıya kadar bütün sayıların karelerini hesaplayan program

        Scanner input = new Scanner(System.in);

        int kare ;

        System.out.println(" bir sayı girin ");
        int sayı = input.nextInt();

        for (int i = 0 ; i <= sayı ; i ++ ){
            kare = i * i ;
            System.out.println(i + " sayının karesi = " + kare );
        }

    }

}
