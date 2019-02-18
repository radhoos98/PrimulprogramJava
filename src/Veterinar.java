public class Veterinar {
    String nume;
    int varsta;
    String specializare;
    String culoareHalat;
    long numarTelefon;

    public void consulta() {
        System.out.println("asculta cu stetoscopul");
    }
    public void administreazaTratamentIntramuscular(){
        System.out.println("face injectie intramuscuara");
    }
    public void administreazaTratamentIntravenos(){
        System.out.println("pune perfuzie");
    }
    public void toaleteaza (){
        System.out.println("perie blana si toaleteaza unghiile");
    }
    public void treat (){
        System.out.println("da cainelui o bomboana");
    }
}
