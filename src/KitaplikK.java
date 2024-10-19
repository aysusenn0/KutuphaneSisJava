
import java.util.Random;


public class KitaplikK {
   public String [] kitaplar ={"Golgelerin Kenarindaki Hayaller","Zamanin Izleri","Kayip Ruzgarlar","Yildizlarin Altinda","Sonsuz Gece","Kirik Aynalar","Buzdan Sehir","Hayalperestler icin Gunluk","Golgelerin Dansi","Kayip Harfler"};
   public String [] yazarlar={"Elif Yildirim","Ahmet Caner","Melis Acar","Deniz Arslan","Selin Kaya","Baran Ozdemir","Zeynep Durmaz","Ece Yucel","Cenk Ugur","Lale Bahar"};
   public String [] turler ={"Roman","Bilim Kurgu","Fantastik","Ask Romani","Korku","Psikolojik Gerilim","Distopya","Deneme","Tarihi Kurgu","Cocuk Kitabı"};
   public String [] yerler = {"A1","A2","A5","A1","A5","A2","A3","A4","A1","A5"};
   public void kitapAra(String kitap)
   {
int sayac=0;

       for(int i=0;i<10;i++)
       {
           kitap.toLowerCase();
           if(!kitap.equals(kitaplar[i])){
           continue;
           }
           else{
               System.out.println("Kutuphanemizde "+kitap+" isimli kitap bulunuyor. ");
               Random random = new Random();
               int rastgeleSayi = random.nextInt(10) + 1; 
               System.out.println("Kitap "+yerler[rastgeleSayi]+" bolgesinde bulunuyor.Yetkiliden yardim isteyiniz...");
               sayac++;
               break;
           }
       }
       if(sayac==0)
       {
           System.out.println("Aradiginiz kitap bulunamadi..");
       }
       else {
           
       }
   }
   public void TurAra(String tur)
   {
       int sayac=0;
       for(int i=0;i<10;i++)
       {
           tur.toLowerCase();
           if(!tur.equals(turler[i])){
               sayac=0;
               continue;
           }
           else {
               System.out.println("Kutuphanemizde "+tur+" turunde kitap bulunuyor.");
               Random random = new Random();
               int rastgeleSayi = random.nextInt(10) + 1; 
               System.out.println("Bu ture ait kitap "+yerler[rastgeleSayi]+" bolgesinde bulunuyor.Yetkiliden yardim isteyiniz...");
               sayac++;
               break;
           }
       }
       if(sayac==0)
       {
           System.out.println("Aradiginiz tur bulunamadi..");
       }
       else {
           
       }
   }
 
public void YazarAra(String yazar)
   {
       int sayac=0;
       for(int i=0;i<10;i++)
       {
           yazar.toLowerCase();
           if(!yazar.equals(this.yazarlar[i])){
               sayac=0;
               continue;
           }
           else {
               System.out.println("Kutuphanemizde "+yazar+" isimli yazarin kitabi bulunuyor.");
               Random random = new Random();
               int rastgeleSayi = random.nextInt(10) + 1; 
               System.out.println("Bu yazarin kitaplari "+yerler[rastgeleSayi]+" bolgesinde bulunuyor.Yetkiliden yardim isteyiniz...");
               sayac++;
               break;
           }
       }
       if(sayac==0)
       {
           System.out.println("Aradiginiz yazar bulunamadi..");
       }
       else {
           
       }
   }
   
}