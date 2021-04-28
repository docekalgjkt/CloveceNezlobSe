package cz.gjkt.zlomky;
import java.util.Random;


public class Kostka {

    private Random random;
    private int pocetSten;

    public Kostka(int pocetSten) {
    this.pocetSten = pocetSten;
    random = new Random();
    }
    public Kostka() {
        pocetSten = 6;
        random = new Random();
    }
    public int hodCislo() {
        return random.nextInt(pocetSten) + 1 ;
    }

    public int getPocetSten() {
        return pocetSten;
        }



}
