package Animalrescue;

public class Human {
    private String name;
    private String culoare;
    private int varsta;
    private float inaltime;
    private float greutate;
    private String ocupatie;
    private long numarDeTelefon;

    public void setName(String name) {
        this.name = name;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setNumarDeTelefon(long numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    public String getName() {
        return name;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public float getInaltime() {
        return inaltime;
    }

    public float getGreutate() {
        return greutate;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public long getNumarDeTelefon() {
        return numarDeTelefon;
    }


    public void run() {
        System.out.println("run");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void buyFood() {
        System.out.println("buy food");
    }

    public void callTheAnimal() {
        System.out.println("call animal");
    }
    public void moove(){
        System.out.println("moove");
    }
    public void eat(){
        System.out.println("eat");
    }
    public void work(){
        System.out.println("work");
    }
    public void relax (){
        System.out.println("relax");
    }

}
