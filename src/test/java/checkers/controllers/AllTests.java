package checkers.controllers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    CancelControllerTest.class,
    LogicTest.class,
    MoveControllerTest.class,
    PlayControllerTest.class,
    ResumeControllerTest.class,
    StartControllerTest.class,
})
public class AllTests {


}
