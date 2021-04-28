import java.util.LinkedList;

public class StartovniDomecek {

    private LinkedList<Figurka> figurky = new LinkedList<>();
    private int pocet;
    

    public StartovniDomecek(int pocet, BarvaFigurky barvaFigurky){
        for(int i=0;i<pocet;i++){
            figurky.addFirst(new Figurka(barvaFigurky));
        }
    }

    public Figurka nasadFigurku(){
        if(!jePrazdny()) return figurky.removeFirst();
        else return null;
    }

    public void vratFigurku(Figurka figurka){figurky.addFirst(figurka);}

    public boolean jePrazdny() {return figurky.isEmpty();}

    public int zbyvaFigurek() {
        if (jePrazdny()) {
            return 0;
        }
        return figurky.size();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < pocet;i++) {
            if (figurky.get(i) == null) {
                sb.append("0");
            }
            else {
                sb.append("1");
            }
            sb.append("|");
        }

        return sb.toString();
    }
}