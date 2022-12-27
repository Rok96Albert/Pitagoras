package pitagoras;

import java.util.*;

public class Main {

    public static double[] catetos = new double[3];

    public static Scanner scan;

    public static void main(String[] args){

        scan = new Scanner(System.in);

        System.out.println("Cateto a:");
        catetos[0] = scan.nextDouble();

        System.out.println("Cateto b:");
        catetos[1] = scan.nextDouble();

        System.out.println("La hipotenusa es: ");

        double hipo = (catetos[0]*catetos[0])+(catetos[1]*catetos[1]);

        System.out.println(Math.sqrt(hipo));
    }
}
