package Animalrescue;

public class Veterinar extends Human{

   private String specializare;
   private String culoareHalat;


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

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public String getCuloareHalat() {
        return culoareHalat;
    }

    public String getSpecializare() {
        return specializare;
    }


}
