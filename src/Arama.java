
import java.util.Scanner;


public class Arama  {
    Scanner scanner=new Scanner(System.in);

    private String kitap;

    private String tur;

    private String yazar;
KitaplikK kitap1=new KitaplikK();

    public void kitapArama () throws InterruptedException
{
    //String kitap;
    System.out.println("Aradiginiz kitabin ismini giriniz :");
   this.kitap=scanner.nextLine();
   Thread.sleep(3000);
   kitap1.kitapAra(kitap);
}
    public void turArama() throws InterruptedException
    {
        System.out.println("Aradiginiz turu giriniz : ");
        this.tur=scanner.nextLine();
        Thread.sleep(3000);
        kitap1.TurAra(tur);
    }
    public void yazarArama() throws InterruptedException
    {
        System.out.println("Aradiginiz yazari giriniz : ");
        this.yazar=scanner.nextLine();
        Thread.sleep(3000);
        kitap1.YazarAra(yazar);
    }
    
}
