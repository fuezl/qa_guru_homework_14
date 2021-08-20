package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTests {

    @Test
    public void testWebLocal() {
        System.setProperty("remote", "local");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browser()).isEqualTo("chrome");
        assertThat(config.browserVersion()).isEqualTo("91.0");
        assertThat(config.remoteDriverUrl()).isEqualTo(false);
    }
    // команда для запуска теста ./gradlew clean test -Dremote=local

    @Test
    public void testRemote() {
        System.setProperty("remote", "remote");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browser()).isEqualTo("firefox");
        assertThat(config.browserVersion()).isEqualTo("87.0");
        assertThat(config.remoteDriverUrl()).isEqualTo(true);
    }

    // команда для запуска теста ./gradlew clean test -Dremote=remote
}
