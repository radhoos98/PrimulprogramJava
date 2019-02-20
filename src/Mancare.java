public class Mancare {
   private double greutate;
   private int numarPortii;
    private String denumire;
   private String ambalare;
   private String continut;

    public void miros (){
        System.out.println("adulmeca");
    }
    public void gust (){
        System.out.println("imbietor");
    }
    public void consistenta (){
        System.out.println( "bucatele");
    }
public void setGreutate(double greutate){
        this.greutate= greutate;
}

    public int getNumarPortii() {
        return this.numarPortii;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public String getAmbalare() {
        return this.ambalare;

    }

    public String getContinut() {
        return this.continut;
    }

    public void setAmbalare(String ambalare) {
        this.ambalare = ambalare;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNumarPortii(int numarPortii) {
        this.numarPortii = numarPortii;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }
}

