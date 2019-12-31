package stratego;

import java.util.ArrayList;

public class Pion {
    private int waarde;
    private String naam;
    private boolean dood;
    private int maxKeer;
    private ArrayList<Pion> pionnen;

    public Pion(){
        pionnen = new ArrayList<>();
    }

    public Pion(int waarde, String naam, boolean dood, int maxKeer){
        this.waarde=waarde;
        this.naam = naam;
        this.dood= dood;
        this.maxKeer =maxKeer;
    }


    public void voegPionToe(Pion spelstuk){
        pionnen.add(spelstuk);
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setDood(boolean dood) {
        this.dood = dood;
    }

    public void setMaxKeer(int maxKeer) {
        this.maxKeer = maxKeer;
    }

    public int getWaarde() {
        return waarde;
    }

    public String getNaam() {
        return naam;
    }

    public boolean isDood() {
        return dood;
    }

    public int getMaxKeer() {
        return maxKeer;
    }

    @Override
    public String toString() {
        return "Pion{" +
                "waarde='" + waarde + '\'' +
                ", naam='" + naam + '\'' +
                ", dood=" + dood +
                ", maxKeer=" + maxKeer +
                ", pionnen=" + pionnen +
                '}';
    }
}
