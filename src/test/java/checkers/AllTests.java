package checkers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    checkers.controllers.AllTests.class,
    checkers.models.AllTests.class,
    checkers.CheckersTest.class
	})
public class AllTests {

}