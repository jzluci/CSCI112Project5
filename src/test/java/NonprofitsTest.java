import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class NonprofitsTest {

    @Test
    void empty() throws IOException {
        Nonprofits n = new Nonprofits();
        assertNotNull(n);

    }

    @Test
    void nonEmptyName() throws IOException {
        Nonprofits n = new Nonprofits("a","");
        assertEquals("a",n.getName());

    }

    @Test
    void nonEmptyAcronym() throws IOException {
        Nonprofits n = new Nonprofits("","a");
        assertEquals("a",n.getAcronym());

    }

    @Test
    void setName() throws IOException {
        Nonprofits n = new Nonprofits();
        n.setName("a");
        assertEquals("a",n.getName());
    }

    @Test
    void setAcronym() throws IOException {
        Nonprofits n = new Nonprofits();
        n.setAcronym("a");
        assertEquals("a",n.getAcronym());
    }


    @Test
    void setOverallActivityPercentage() throws IOException {
        Nonprofits n = new Nonprofits();
        n.addPromotor("a","b", 2.0);
        n.addPromotor("a","b", 2.0);
        n.addPromotor("a","b", 2.0);
        n.addPromotor("a","b", 2.0);
        n.addPromotor("a","b", 2.0);
        assertEquals(2.0,n.getOverallActivityPercentage());
    }

    @Test
    void addPromotor() throws IOException {
        Nonprofits n = new Nonprofits();
        n.addPromotor("a","b", 1.0);
        assertNotNull(n.getPromotors());
    }
}