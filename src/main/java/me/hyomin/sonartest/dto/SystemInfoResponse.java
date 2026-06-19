package me.hyomin.sonartest.dto;


public class SystemInfoResponse {
    private final String appName;
    private final String env;
    private final String version;
    private final long currentTimeMillis;

    public SystemInfoResponse(String appName, String env, String version, long currentTimeMillis) {
        this.appName = appName;
        this.env = env;
        this.version = version;
        this.currentTimeMillis = currentTimeMillis;
    }

    public String getAppName() { return appName; }
    public String getEnv() { return env; }
    public String getVersion() { return version; }
    public long getCurrentTimeMillis() { return currentTimeMillis; }
}