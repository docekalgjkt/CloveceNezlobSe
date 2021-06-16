package app;

import cz.gjkt.zlomky.Kostka;

public class Main {

    public static void main(String[] args) {

        Kostka kostka = new Kostka();
        Kostka kostka1 = new Kostka(6);
        Kostka kostkaB = new Kostka(7);

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + ". " + kostkaB.hodCislo());
        }
    }
}
