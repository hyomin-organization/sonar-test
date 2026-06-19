package me.hyomin.sonartest.config;


public class AppConfig {
    public static final String APP_NAME = "Sonar-JaCoCo-Test-API";
    public static final String APP_VERSION = "v1.0.0";

    // 배포 환경에 따라 바뀔 수 있는 기본 환경 정보 (DB가 없으므로 파일 내부 고정)
    public static final String DEPLOY_ENV = "PROD-LIVE";
}