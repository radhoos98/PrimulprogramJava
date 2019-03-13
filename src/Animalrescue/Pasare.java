package Animalrescue;

public class Pasare extends Animal {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getRasa() {
        return super.getRasa();
    }

    @Override
    public int getVarsta() {
        return super.getVarsta();
    }

    @Override
    public String getCuloare() {
        return super.getCuloare();
    }

    @Override
    public float getGreutate() {
        return super.getGreutate();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setRasa(String rasa) {
        super.setRasa(rasa);
    }

    @Override
    public void setVarsta(int varsta) {
        super.setVarsta(varsta);
    }

    @Override
    public void setCuloare(String culoare) {
        super.setCuloare(culoare);
    }

    @Override
    public void setGreutate(float greutate) {
        super.setGreutate(greutate);
    }

    Pasare privighetoare=new Pasare();

    public Pasare getPrivighetoare() {
        return privighetoare;
    }

    public void setPrivighetoare(Pasare privighetoare) {
        this.privighetoare = privighetoare;

    }
    Pasare ciocarlie=new Pasare();

    public Pasare getCiocarlie() {
        return ciocarlie;
    }

    public void setCiocarlie(Pasare ciocarlie) {
        this.ciocarlie = ciocarlie;
    }

    Pasare pitigoi=new Pasare();

    public Pasare getPitigoi() {
        return pitigoi;
    }

    public void setPitigoi(Pasare pitigoi) {
        this.pitigoi = pitigoi;
    }
}

