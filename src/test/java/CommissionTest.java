import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CommissionTest {

    @Test
    void empty() throws IOException {
        Commission c = new Commission();
        assertNotNull(c);

    }

    @Test
    void nonEmptyYear() throws IOException {
        Commission c = new Commission(2);
        assertEquals(2,c.getCurrentYear());

    }

    @Test
    void setCurrentYear() throws IOException {
        Commission c = new Commission();
        c.setCurrentYear(2);
        assertEquals(2,c.getCurrentYear());

    }


    @Test
    void addNonProfit() throws IOException {
        Commission c = new Commission();
        c.addNonProfit("a","b");
        assertNotNull(c.getNonprofits());
    }

    @Test
    void sort() throws IOException {
        Commission c = new Commission();
        Commission d = new Commission();

        d.addNonProfit("a","b");
        d.getNonprofit(0).addPromotor("a","b",1);
        d.getNonprofit(0).addPromotor("b","b",2);
        d.getNonprofit(0).addPromotor("c","b",3);
        d.getNonprofit(0).addPromotor("d","b",4);

        c.addNonProfit("a","b");
        c.getNonprofit(0).addPromotor("b","b",2);
        c.getNonprofit(0).addPromotor("d","b",4);
        c.getNonprofit(0).addPromotor("a","b",1);
        c.getNonprofit(0).addPromotor("c","b",3);
        c.sort();

        assertEquals(d.getNonprofit(0).getPromotors().get(0).getActivityPercentage(), c.getNonprofit(0).getPromotors().get(0).getActivityPercentage());
        assertEquals(d.getNonprofit(0).getPromotors().get(1).getActivityPercentage(), c.getNonprofit(0).getPromotors().get(1).getActivityPercentage());
        assertEquals(d.getNonprofit(0).getPromotors().get(2).getActivityPercentage(), c.getNonprofit(0).getPromotors().get(2).getActivityPercentage());
        assertEquals(d.getNonprofit(0).getPromotors().get(3).getActivityPercentage(), c.getNonprofit(0).getPromotors().get(3).getActivityPercentage());





    }
}