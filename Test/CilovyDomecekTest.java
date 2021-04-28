import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CilovyDomecekTest {

    private List<Figurka> figurky = new ArrayList<>(4);
    private BarvaFigurky barvaFigurky;


    @Test
    void jeVolno() {
        CilovyDomecek cd = new CilovyDomecek(4, new BarvaFigurky(0,50));
        BarvaFigurky bf = new BarvaFigurky(0,50);

        cd.setFigurka(1, new Figurka(bf));

        assertEquals(false, cd.jeVolno(1));

    }

    @Test
    void jePlno() {







    }




    @Test
    void setFigurka() {

        CilovyDomecek cd = new CilovyDomecek(3, new BarvaFigurky(0,50));
        BarvaFigurky bf = new BarvaFigurky(0,50);

        cd.setFigurka(1, new Figurka(bf));


        assertEquals(false, cd.jeVolno(1));
    }

    @Test
    void getFigurkyKPohybu(int pocet) {
        List<Figurka> figurkaList = new ArrayList<>();
        for (Figurka f:figurky) {
            for (int i = figurky.indexOf(f);i<pocet;i++) {
                if(figurky.get(i)==null) figurkaList.add(f);
            }
        }
        System.out.println(figurkaList);
    }

    @Test
    void testJeVolno() {
    }

    @Test
    void testJePlno() {
    }

    @Test
    void testSetFigurka() {
    }

    @Test
    void testGetFigurkyKPohybu() {
    }

    @Test
    void testToString() {
        CilovyDomecek cd = new CilovyDomecek(4, new BarvaFigurky(0,4));
        BarvaFigurky bf = new BarvaFigurky(0,50);

        cd.setFigurka(1, new Figurka(bf));
        cd.setFigurka(3, new Figurka(bf));


        System.out.println(cd.toString());
    }
}