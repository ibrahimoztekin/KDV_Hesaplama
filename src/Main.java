import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat Giriniz: ");
        double fiyat=input.nextInt();

        while (fiyat<0){
            System.out.print("Lütfen Sıfırdan Büyük Sayı Giriniz: ");
            fiyat=input.nextInt();
        }

        fiyat=(fiyat>0 && fiyat<=1000)? fiyat*0.18:fiyat*0.8;

        System.out.println("KDV Tutarı: "+fiyat+" TL");

    }
}
