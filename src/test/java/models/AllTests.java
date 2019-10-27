package models;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    BoardTest.class,
    CoordinateTest.class,
    DameTest.class,
    GameTest.class,
    PawnTest.class,
    SquareTest.class,
    TurnTest.class,
    StateTest.class,
    TurnTest.class
})

public class AllTests {
}
