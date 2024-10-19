
public class Bulma {
    public String secim;
    public boolean olay=true;
    Arama arama=new Arama();
    public void secme(String islem) throws java.lang.InterruptedException
    {
        if(islem.equals("1"))
        {
            arama.kitapArama();
        }
        else if(islem.equals("2"))
        {
            arama.yazarArama();
        }
        else if(islem.equals("3"))
        {
            arama.turArama();
        }
        else if(islem.equals("q"))
        {
            System.out.println("Arama sayfasi kapatiliyor.\n");
            olay=false;
            return;
        }
        else {
            System.out.println("Aradiginiz kelime bulunamadi..");
        }
    }

    
}
