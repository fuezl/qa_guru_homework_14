package config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("");
    }
}
