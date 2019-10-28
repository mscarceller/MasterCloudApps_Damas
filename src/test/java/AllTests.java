import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    controllers.AllTests.class,
    models.AllTests.class,
    CheckersTest.class
	})
public class AllTests {

}