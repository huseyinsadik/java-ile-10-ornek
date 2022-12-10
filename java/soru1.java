import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        // çemberin çevresini hesaplayan bir program

        Scanner input = new Scanner(System.in);

        double r ;

        System.out.println(" çemberin yarı çabını girin");
        r = input.nextDouble();

        System.out.println(" çemberin çevresi = " + Math.PI*r*2);
    }
}
