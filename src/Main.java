import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Mükemmel Sayı Bulma Programı");
        int number, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number = scanner.nextInt();

        /**
         * Bir sayının kendisi hariç pozitif tam sayı çarpanları
         * (kalansız bölen sayıların) toplamı kendisine
         * eşit olan sayıya mükemmel sayı denir
         */

        for(int i = 1; i <= number/2; i++){
            if(number%i == 0){
                total += i;
            }
        }
        if(total == number){
            System.out.println("Girdiğiniz Sayı Mükkemmel Bir Sayıdır.");
        }else{
            System.out.println("Üzgünüm! Sayı Mükemmel Değildir.");
        }

    }
}
