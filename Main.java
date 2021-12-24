import java.util.Scanner;

import javax.crypto.interfaces.PBEKey;

public class Main {
    public static <E extends Aday> E Birinci(E e1,E e2 ,E e3){
        if(e1.puanhesapla()>e2.puanhesapla() && e1.puanhesapla()>e3.puanhesapla()){
            return e1;
        }
        else if(e2.puanhesapla()> e1.puanhesapla()&& e2.puanhesapla()>e3.puanhesapla()){
            return e2;
        }
        return e3;
    }
    public static void main(String[] args) {
       System.out.println("Ygs-Lys puan Hesaplam Programına Hoşgeldiniz"); 
       Scanner scanner = new Scanner(System.in);
       String islemler= "1-Sayısal öğrenci puan hesaplama\n"+
                         "2-Eşit Ağırlık öğrenci puan hesaplama"
                         +"3-çıkış için q ya basın";
        String secenek;
        System.out.println("Yapmak istediğiniz işlemi seçin");
        while(true){
           secenek=scanner.nextLine();
           if(secenek.equals("1")){
               Sayısal sayısal1= new Sayısal(50, 40, 35, 25, 31,"Mert");
               Sayısal sayısal2= new Sayısal(45, 41, 35, 15, 11,"Engin");
               Sayısal sayısal3= new Sayısal(42, 45, 25, 35, 21,"Sema");
               Sayısal birinci= Birinci(sayısal1, sayısal2, sayısal3);
               System.out.println("Birinci öğrenci ismi: " + birinci.getİsim());
               System.out.println("Birinci öğrenci puan: " + birinci.puanhesapla());
           }
           else if(secenek.equals("2")){
            EsitAgırlık esitağırlık1= new EsitAgırlık(30, 10, 25, 15, 21,"Mert");
            EsitAgırlık esitağırlık2= new EsitAgırlık(26, 34, 25, 14, 31,"Engin");
            EsitAgırlık esitağırlık3= new EsitAgırlık(22, 25, 25, 35, 21,"Sema");
            EsitAgırlık birinci= Birinci(esitağırlık1, esitağırlık2, esitağırlık3);
            System.out.println("Birinci öğrenci ismi: " + birinci.getİsim());
            System.out.println("Birinci öğrenci puan: " + birinci.puanhesapla());
           }
           else if(secenek.equals("q")){
               System.out.println("Programdan çıkılıyor");
               break;

           }
        }
        
    }
}
