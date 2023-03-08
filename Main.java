import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Eleman sayısını giriniz : ");
     int elemansayısı = input.nextInt();

     double[] list = new double[elemansayısı];
     double sum = 0.0 ;

     for(int i = 0; i < list.length; i++ ) {
         sum += 1/list[i];
         System.out.print("Dizinin " + i + ". elemanını giriniz:");
         list[i] = input.nextInt();

     }
        System.out.print("Oluşturulan dizi: [ ");

        for ( double sayi:list ){
            System.out.print(sayi + " ");
        }

        System.out.print("]");
        System.out.println("\nSayıların harmonik serisi:" + sum);
        System.out.println("Sayıların harmonik ortalaması : " + elemansayısı/sum);
    }
}


