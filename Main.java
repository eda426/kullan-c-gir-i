import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName = "eda", password = "1234";
        String sifre = "";
        Scanner input = new Scanner(System.in);


        System.out.println("Kullanıcı adınız:");
        String girName = input.nextLine();
        System.out.println("şifreniz");
        String girPas = input.nextLine();

        if (girName.equals(userName) && girPas.equals(password)) {
            System.out.println("Giriş başarılı :");
        } else if (girName.equals(userName)) {
            System.out.println("şifreniz yanlış:Şifrenizi degiştirmek istermisiniz?E/H");
            String sifirla = input.nextLine();
            if (sifirla.equalsIgnoreCase("e")) {
                System.out.println("yeni şifre:");
                String yeniSifre = input.nextLine();
                if (yeniSifre.equals((girPas)) || yeniSifre.equals(password)) {
                    System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("şifre iptal edildi");


            }
        } else {
            System.out.println("kullanıc adı yaa şifre hatalı");
        }
    }
}

