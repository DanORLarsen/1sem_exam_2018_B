import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MediaIDTest {

    @Test
    public void generate() {
        for (int i = 0; i < 500; i++) {
            //Den tjekker om MediaID nogen sinde bliver det samme
            Assert.assertNotEquals(MediaID.generate(),MediaID.generate());
        }
    }
}