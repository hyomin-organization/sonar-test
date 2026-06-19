package me.hyomin.sonartest;

import me.hyomin.sonartest.config.AppConfig;
import me.hyomin.sonartest.dto.SystemInfoResponse;
import me.hyomin.sonartest.dto.SystemStatusResponse;
import org.springframework.stereotype.Service;

@Service
public class SystemService {

    public SystemStatusResponse checkStatus() {
        // DB 조회가 없는 대신 시스템이 정상 작동 중임을 명시적으로 반환
        return new SystemStatusResponse("UP", "Application is running smoothly without DB dependency.");
    }

    public SystemInfoResponse getSystemInfo() {
        // Config의 상수를 결합하여 가공된 데이터 반환
        return new SystemInfoResponse(
                AppConfig.APP_NAME,
                AppConfig.DEPLOY_ENV,
                AppConfig.APP_VERSION,
                System.currentTimeMillis()
        );
    }
}
