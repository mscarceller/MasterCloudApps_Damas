import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CheckersTest {

    @Test
    public void givenCheckersWhenInitCheckersThenAllisOK(){
        Checkers checkers =  new Checkers();
        assertNotNull(checkers.logic);
        assertNotNull(checkers.view);
    }

}