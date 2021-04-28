import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class HraciPlochaTest {

    /*
    @Test
    void nasad() {
    }
    */


    @Test
    void testNasad() {
        HraciPlocha hp = new HraciPlocha(1,1,20);
        BarvaFigurky bf = new BarvaFigurky(0,50);

        Figurka figurka = new Figurka(bf);
        hp.nasad(figurka);
        assertEquals(1, hp.nasad(figurka));
    }




    /*
    @Test
    void posunFigurku() {
    }
    */


    @Test
    void testPosunFigurku() {


    }

    @Test
    void vratMozneFigurky() {
    }

}