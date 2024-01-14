import java.util.Scanner;

public class proje16karaktersayısıbulma {
    public static void main(String[] args) {
      
        String metin = "Boşuna Yağıyor Yağmur Birlikte Islanyacağız ki";

        System.out.println("Metin: " + metin);

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

       
        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == karakter) {
                sayac++;
            }
        }

        // Sonucu ekrana yazdır
        System.out.println("Karakterin metin içindeki adedi: " + sayac);

        scanner.close();
    }
}
