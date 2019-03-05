public class Veterinar extends Human{
  private   String nume;
   private int varsta;
   private String specializare;
   private String culoareHalat;
   private long numarTelefon;

    public void consulta() {
        System.out.println("asculta cu stetoscopul");
    }

    public void administreazaTratamentIntramuscular() {
        System.out.println("face injectie intramuscuara");
    }

    public void administreazaTratamentIntravenos() {
        System.out.println("pune perfuzie");
    }

    public void toaleteaza() {
        System.out.println("perie blana si toaleteaza unghiile");
    }

    public void treat() {
        System.out.println("da cainelui o bomboana");
    }

    public void setCuloareHalat(String culoareHalat) {
        this.culoareHalat = culoareHalat;
    }

    public void setNumarTelefon(long numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public long getNumarTelefon() {
        return numarTelefon;
    }

    public String getCuloareHalat() {
        return culoareHalat;
    }

    public String getNume() {
        return nume;
    }

    public String getSpecializare() {
        return specializare;
    }

    Veterinar Matei=new Veterinar();

    public Veterinar getMatei() {
        return Matei;
    }
    Veterinar Popescu=new Veterinar();

    public Veterinar getPopescu() {
        return Popescu;
    }
}
