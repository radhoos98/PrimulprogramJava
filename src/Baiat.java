public class Baiat extends Human {
   private String culoare;
   private int varsta;
   private int inaltime;
   private  float greutate;
     private String nume;

    public void alearga() {
        System.out.println("Baiatul alearga mult");
    }

    public void doarme() {
        System.out.println("Baiatul sforaie...zzz");
    }

    public void cumparaMancare() {
        System.out.println("Baiatul cumpara petfood");
    }

    public void cheamaCatelul() {
        System.out.println("Hey Doggie Doggie!");
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public float getGreutate() {
        return greutate;
    }


    public String getCuloare() {
        return culoare;
    }

    Baiat Ionut=new Baiat();

    public Baiat getIonut() {
        return Ionut;
    }

    Baiat Alexandru=new Baiat();

    public Baiat getAlexandru() {
        return Alexandru;
    }
}

