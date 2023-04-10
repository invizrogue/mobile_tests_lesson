package study.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})

public interface MobileConfig extends Config {

    @Key("user")
    String getUser();

    @Key("key")
    String getKey();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getOsVersion();

    @Key("project")
    String getProject();

    @Key("build")
    String getBuild();

    @Key("name")
    String getName();

    @Key("remote_url")
    String getRemoteUrl();

    @Key("device_name")
    String getDeviceName();

    @Key("platform_version")
    String getPlatformVersion();

    @Key("app_package")
    String getAppPackage();

    @Key("app_activity")
    String getAppActivity();

    @Key("app_url")
    String getAppUrl();

    @Key("app_path")
    String getAppPath();
}
