package Exercise;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double perArmut = 2.14;
        double perElma = 3.67;
        double perDomates = 1.11;
        double perMuz = 0.95;
        double perPatlican = 5.0;

        double armut,elma,domates,muz,patlican;

        System.out.print("Armuttan alınan miktar : ");
        armut = scanner.nextDouble();
        System.out.print("Elmadan alınan miktar : ");
        elma = scanner.nextDouble();
        System.out.print("Domatesten alınan miktar : ");
        domates = scanner.nextDouble();
        System.out.print("Muzdan alınan miktar : ");
        muz = scanner.nextDouble();
        System.out.print("Patlıcandan alınan miktar : ");
        patlican = scanner.nextDouble();

        double tutar = (armut * perArmut) + (elma * perElma) + (domates * perDomates)
                + (muz * perMuz) + (patlican * perPatlican);
        System.out.println("Ödenecek toplam tutar : " + tutar);
    }


}
