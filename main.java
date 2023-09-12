import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String isim, sifre;
        int sifreSifirlama, pw;
        Scanner inp = new Scanner(System.in);

        System.out.print("İsim: ");
        isim = inp.nextLine();

        System.out.print("Şifre: ");
        sifre = inp.nextLine();

        if (isim.equals("cahit") && sifre.equals("123")) {
            System.out.println("Başarıyla giriş yaptınız!\nYönlendiriliyorsunuz.");
        } else {
            System.out.println("Şifre ya da kullanıcı adı yanlış\nŞifrenizi sıfırlamak ister misiniz? İsterseniz lütfen 1'e basınız.");
        }
        sifreSifirlama = inp.nextInt();

        if (sifreSifirlama == 1) {
            System.out.println("Unutmayın, yeni şifreniz eskisiyle aynı olamaz ve yalnızca sayılardan oluşmalıdır!");
            System.out.println("Yeni şifrenizi giriniz: ");
        }
        pw = inp.nextInt();
        if (pw == 123) {
            System.out.println("Eski bir şifre girdiniz");
        } else {
            System.out.println("Şifreniz Başarıyla değiştirildi!");
        }
    }
}