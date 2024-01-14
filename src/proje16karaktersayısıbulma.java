import java.util.Scanner;

public class proje16karaktersayısıbulma {
    public static void main(String[] args) {
        // Kullanıcıya gösterilecek metin
        String metin = "Bu bir örnek metindir.";

        System.out.println("Metin: " + metin);

        // Kullanıcıdan bir karakter girmesini iste
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

        // Karakterin metin içinde kaç kez geçtiğini hesapla
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
