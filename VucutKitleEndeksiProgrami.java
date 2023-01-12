import java.util.Scanner;
public class VucutKitleEndeksiProgrami {
    public static void main(String[] args) {

        /** TayTayTay54 */

        double kg, m,index;

        System.out.println("Vücut Kitle İndeksi Hesaplama Programına Hoş Geldiniz !!!");
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu (Kilogram Cinsinden) Giriniz: ");
        kg = input.nextDouble();
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden,Örnek=1,70) Giriniz: ");
        m = input.nextDouble();

        index = kg/(m*m);
        System.out.println("Vücut Kitle İndexiniz: "+index);
    }
}
