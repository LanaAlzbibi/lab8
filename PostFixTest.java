import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostFixTest {
    @BeforeEach
    void setUp() throws Exception {
       Stack stack = new StackAsList<Integer>();



    }

    @Test
    void postfix(){
        PostFix x = new PostFix();

        String s = "231*+9-";
        double px = x.evaluates(s);

        String a ="12*3+";
        double px1 = x.evaluates(a);

        String b ="123*+";
        double px2 = x.evaluates(b);

        String c ="12+34^-";
        double px3 = x.evaluates(c);

        String d ="12^34*-";
        double px4 = x.evaluates(d);

        String e ="123*+45^-6+";
        double px5 = x.evaluates(e);

        String f = "12+3*456-^+";
        double px6 = x.evaluates(f);

        String g ="12+34/+5+678+*+";
        double px7 = x.evaluates(g);

        String h = "91-2-32*-1-"  ;
        double px8 = x.evaluates(h);

        assertEquals(-4, px);
        assertEquals(5, px1);
        assertEquals(7, px2);
        assertEquals(-78, px3);
        assertEquals(-11, px4);
        assertEquals(-1011, px5);
        assertEquals(9, px6);
        assertEquals(98, px7);
        assertEquals(-1, px8);

    }

}