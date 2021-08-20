package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${remote}.properties" //файл в папочке resources
})

public interface WebConfig extends Config {
    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();
}
