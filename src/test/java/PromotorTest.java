import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromotorTest {

    @Test
    void empty(){
        Promotor p = new Promotor();
        assertNotNull(p);

    }

    @Test
    void nonEmptyName(){
        Promotor p = new Promotor("a","",0.0);
        assertEquals("a",p.getName());

    }

    @Test
    void nonEmptyHometown(){
        Promotor p = new Promotor("","a",0.0);
        assertEquals("a",p.getHometown());

    }
    @Test
    void nonEmptyActivity(){
        Promotor p = new Promotor("","",1.0);
        assertEquals(1.0,p.getActivityPercentage());

    }

    @Test
    void setName() {
        Promotor p = new Promotor();
        p.setName("a");
        assertEquals("a",p.getName());
    }

    @Test
    void setHometown() {
        Promotor p = new Promotor();
        p.setHometown("a");
        assertEquals("a",p.getHometown());
    }

    @Test
    void setActivityPercentage() {
        Promotor p = new Promotor();
        p.setActivityPercentage(1.0);
        assertEquals(1.0,p.getActivityPercentage());
    }
}