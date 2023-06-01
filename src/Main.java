import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("***************************************\n" +
                "     Ziraat Bankası'na Hoşgeldiniz...\n" +
                "***************************************");
        int balance = 1000;
        String islemler = "1.Bakiye Öğrenme\n" +
                            "2. Para Çekme\n" +
                             "3.Para Yatırma\n" +
                        "Çıkmak için q'ya basınız.";

        Scanner scanner = new Scanner(System.in);

       while (true) {
           System.out.println("*************************");
           System.out.println(islemler);
           System.out.println("*************************");
           System.out.println("Lütfen işlem seçiniz:");
           String islem = scanner.nextLine();
           if (islem.equals("q")) {

               System.out.println("Hesabınızdan çıkış yapılmıştır.İyi günler dileriz.");
                break;

           }
           else if (islem.equals("1")) {
               System.out.println("Bakiyeniz:" + balance);


           }
           else if (islem.equals("2")) {
               System.out.println("Çekmek istediğiniz miktarı giriniz.");
               int cekme = scanner.nextInt();
               scanner.nextLine();
               if (cekme < balance) {
                   System.out.println(cekme + " TL hesabınızdan çekildi.");

                   balance -= cekme;
                   System.out.println("Bakiyeniz:"+balance);
               } else {
                   System.out.println("Yetersiz bakiye.Lütfen bir daha deneyiniz.");

               }
           }
           else if (islem.equals("3")) {
               System.out.println("Yatırmak istediğiniz miktarı giriniz.");
               int yatirma = scanner.nextInt();
               scanner.nextLine();
               System.out.println("İşlem tamamlandı.");
               System.out.println(yatirma + " TL hesabınıza yatırıldı.");

               balance += yatirma;
               System.out.println("Bakiyeniz:"+balance);
           }
           else {
               System.out.println("Geçersiz tuşlama.Lütfen belirtilen işlemlerden birini seçiniz.");

           }

       }

    }
}