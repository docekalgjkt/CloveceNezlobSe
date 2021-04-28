import java.util.ArrayList;
import java.util.List;

public class BarvaFigurky {

    static int start;
    int cil;



    BarvaFigurky(int start, int pocetPoli){
        this.start = start;
        int cil = start - 1;
        if (start==0) cil = pocetPoli - 1;



    }




    public static int getStart(){
        return start;
    }

    public int getCil(){
        return cil;
    }
}
