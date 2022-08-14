import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, kalan;
        String zodyak = "";


        System.out.print("Dogum Yilinizi Giriniz: ");
        year = input.nextInt();

        kalan = year % 12;

        if (year > 0) {
            if (kalan == 0) {
                zodyak = "Maymun";
            } else if (kalan == 1) {
                zodyak = "Horoz";
            } else if (kalan == 2) {
                zodyak = "Kopek";
            } else if (kalan == 3) {
                zodyak = "Domuz";
            } else if (kalan == 4) {
                zodyak = "Fare";
            } else if (kalan == 5) {
                zodyak = "Okuz";
            } else if (kalan == 6) {
                zodyak = "Kaplan";
            } else if (kalan == 7) {
                zodyak = "Tavsan";
            } else if (kalan == 8) {
                zodyak = "Ejderha";
            } else if (kalan == 9) {
                zodyak = "Yilan";
            } else if (kalan == 10) {
                zodyak = "At";
            } else if (kalan == 11) {
                zodyak = "Koyun";
            }
        } else {
            System.out.println("Hatali giris yaptiniz!");
        }
        System.out.println("Cin Zodyagi Burcunuz: " + zodyak);
    }
}