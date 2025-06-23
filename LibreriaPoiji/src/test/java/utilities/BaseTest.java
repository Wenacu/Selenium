package utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void beforeClass() {
        Logs.info("Setup del padre");
    }

    @AfterClass
    public void afterClass() {
        Logs.info("Teardown del padre");
    }
}
