public class Catel {
    String nume;
    String rasa;
    int varsta;
    float greutate;

    public void latra (){
        System.out.println("ham ham");
    }
    public void mananca (){
        System.out.println("catelul mananca");
    }
    public void seJoaca (){
        System.out.println("catelul se joaca");
    }
    public void doarme (){
        System.out.println("catelul sforaie");
    }
    public void setNume (String nume){
        this.nume=nume;
    }
    public void setRasa (String rasa){
        this.rasa =rasa;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getRasa() {
        return rasa;
    }

    public float getGreutate() {
        return greutate;
    }

    public int getVarsta() {
        return varsta;
    }
}
