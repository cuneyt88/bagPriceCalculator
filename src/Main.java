import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut= 6.14;
        double elma= 3.67;
        double domates= 5.11;
        double muz= 9.45;
        double patlıcan= 11.35;
        int arm,elm,dom,mz,pat;

        Scanner input=new Scanner(System.in);
        System.out.print("Kaç kilo Armut: ");
        arm=input.nextInt();

        System.out.print("Kaç kilo Elma: ");
        elm=input.nextInt();

        System.out.print("Kaç kilo Domates: ");
        dom=input.nextInt();

        System.out.print("Kaç kilo Muz: ");
        mz=input.nextInt();

        System.out.print("Kaç kilo Patlıcan: ");
        pat=input.nextInt();

        double total= (elma*elm)+(armut*arm)+(domates*dom)+(muz*mz)+(pat*patlıcan);
        System.out.println("Toplam tutar: "+ total);
    }
}