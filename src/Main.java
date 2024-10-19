
import java.util.Scanner;



public class Main {
    public static void main(String[]args) throws InterruptedException
    {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Halk Kutuphanesine Hos Geldiniz ...");
        String islem=
                "\t1-Kitap Arama\n"
                +"\t2-Yazar Arama\n"
                +"\t3-Tur Arama\n"
                +"\tCikis icin q'ya basiniz.";
        Bulma bul=new Bulma();
        while(bul.olay)
        {
             System.out.println(islem);
             System.out.println("Secmek istediginiz islemi giriniz :");
             
             String secim=scanner.nextLine();
             bul.secme(secim);         
        }
        System.out.println("Cikis yapiliyor...");
  
}
}
