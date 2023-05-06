package OOPgiris.src;

public class OOPilk {
    public static void main(String[] args) {
       //public özellikler ile erişim
        /* Araba araba1 = new Araba();
        araba1.marka = "BMW";
        araba1.model = "M3";
        araba1.yil = 2015;
        araba1.renk = "Siyah";
        araba1.beygirGucu = 450;
        araba1.hiz = 300;
        araba1.vites = 6;

        System.out.println("Araba 1");
        System.out.println("Marka: "+araba1.marka);
        System.out.println("Model: "+araba1.model);
        System.out.println("Yıl: "+araba1.yil);
        System.out.println("Renk: "+araba1.renk);
        System.out.println("Beygir Gücü: "+araba1.beygirGucu);
        System.out.println("Hız: "+araba1.hiz);
        System.out.println("Vites: "+araba1.vites);
        */

        //private özellikler ile erişim
        Araba araba2 = new Araba();
        araba2.setMarka(null);
        araba2.setModel("M3");
        araba2.setYil(2015);
        araba2.setRenk("Siyah");
        araba2.setBeygirGucu(-1);
        araba2.setHiz(300);
        araba2.setVites(6);
        System.out.println("Araba 2");
        System.out.println("Marka: "+araba2.getMarka());
        System.out.println("Model: "+araba2.getModel());
        System.out.println("Yıl: "+araba2.getYil());
        System.out.println("Renk: "+araba2.getRenk());
        System.out.println("Beygir Gücü: "+araba2.getBeygirGucu());
        System.out.println("Hız: "+araba2.getHiz());
        System.out.println("Vites: "+araba2.getVites());

    
    }
    
}
