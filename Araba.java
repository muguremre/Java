package OOPgiris.src;

public class Araba {
    private String marka;
    private String model;
    private int yil;
    private String renk;
    private int beygirGucu;
    private int hiz;
    private int vites;

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getMarka() {
        return marka;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYil(int yil) {
        this.yil = yil;
    }
    public int getYil() {
        if(yil<0)
        {
            System.out.println("Yıl 0'dan küçük olamaz.");
            return 0;
        }
        else if(yil>2023)
        {
            System.out.println("Yıl 2023'den büyük olamaz.");
            return 0;
        }
        else
            System.out.println("Yıl değeri geçerli.");
        return yil;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public String getRenk() {
        return renk;
    }
    public void setBeygirGucu(int beygirGucu) {
       if(beygirGucu<=0){
            System.out.println("Beygir gücü 0'dan küçük olamaz.");
            
       }
        else if(beygirGucu>1000){
                System.out.println("Beygir gücü 1000'den büyük olamaz.");
        }
        
        else{
            System.out.println("Beygir gücü geçerli.");
            this.beygirGucu = beygirGucu;
        }
        
        }
    public int getBeygirGucu() {
       
            return beygirGucu;
        }
        
    
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
    public int getHiz() {
        if(hiz<0)
        {
            System.out.println("Hız 0'dan küçük olamaz.");
            return 0;
        }
        else if(hiz>300)
        {
            System.out.println("Hız 300'den büyük olamaz.");
            return 0;
        }
        else
            System.out.println("Hız değeri geçerli.");
        return hiz;
    }
    public void setVites(int vites) {
        this.vites = vites;
    }
    public int getVites() {
        if(vites<0)
        {
            System.out.println("Vites 0'dan küçük olamaz.");
            return 0;
        }
        else if(vites>6)
        {
            System.out.println("Vites 6'dan büyük olamaz.");
            return 0;
        }
        else
            System.out.println("Vites değeri geçerli.");
        return vites;
    }

    
}
