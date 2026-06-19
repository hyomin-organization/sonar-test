package me.hyomin.sonartest;

import me.hyomin.sonartest.config.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SystemController.class)
@Import(SystemService.class)
class SystemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("상태 체크 API 호출 시 서비스 로직까지 거쳐 정상 응답을 반환한다")
    void getStatusTest() throws Exception {
        mockMvc.perform(get("/api/system/status")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("UP"))
                .andExpect(jsonPath("$.message").value(containsString("without DB dependency")));
    }

    @Test
    @DisplayName("시스템 정보 API 호출 시 AppConfig의 상수 값들이 정상 결합되어 반환된다")
    void getInfoTest() throws Exception {
        mockMvc.perform(get("/api/system/info")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appName").value(AppConfig.APP_NAME))
                .andExpect(jsonPath("$.env").value(AppConfig.DEPLOY_ENV))
                .andExpect(jsonPath("$.version").value(AppConfig.APP_VERSION));
    }
}