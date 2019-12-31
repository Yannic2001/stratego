package stratego;

public class Pion {
    private String waarde;
    private String naam;
    private boolean dood;
    private int maxKeer;

    public Pion(String waarde, String naam, boolean dood, int maxKeer){
        this.waarde=waarde;
        this.naam = naam;
        this.dood= dood;
        this.maxKeer =maxKeer;
    }

}
