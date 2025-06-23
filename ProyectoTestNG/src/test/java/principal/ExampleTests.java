package principal;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Logs;

public class ExampleTests {
    @BeforeMethod
    public void setUp() { //precondicion
        Logs.info("Precondicion");
    }

    @Test
    public void primerTest() {
        Logs.info("1er test");
    }

    @AfterMethod
    public void tearDown() { //postcondicion
        Logs.info("Postcondicion");
    }
}
