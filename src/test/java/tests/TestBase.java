package tests;

import helpers.DriverSettings;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void setUp() {
        DriverSettings.configure();
    }
}
