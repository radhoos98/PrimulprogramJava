package Animalrescue;

public class Animal {
    private String name;
    private String culoare;
    private int varsta;
    private float greutate;
    private String rasa;
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }
    public void speak (){
        System.out.println("the animal speaks");
    }
    public void eat (){
        System.out.println("the animal eats");
    }
    public void play (){
        System.out.println("the animal plays");
    }
    public void sleep (){
        System.out.println("the animal sleeps");
    }
    public void runs(){
        System.out.println("the animal runs");
    }
    public void jump(){
        System.out.println("the animal jump");
    }
    public void moove(){
        System.out.println("move");
    }

}
