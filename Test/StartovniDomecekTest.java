import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StartovniDomecekTest {

    private LinkedList<Figurka> figurky = new LinkedList<>();


    @Test
    void jePrazdny() {

        StartovniDomecek sd = new StartovniDomecek(1, new BarvaFigurky(0,20));

        BarvaFigurky bf = new BarvaFigurky(0,50);

        sd.nasadFigurku();

        assertEquals(true, sd.jePrazdny());
        sd.vratFigurku(new Figurka(bf));
        assertEquals(false, sd.jePrazdny());
    }


}
