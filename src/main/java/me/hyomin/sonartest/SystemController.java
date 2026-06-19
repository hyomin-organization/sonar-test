package me.hyomin.sonartest;


import me.hyomin.sonartest.dto.SystemInfoResponse;
import me.hyomin.sonartest.dto.SystemStatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/system")
public class SystemController {

    private final SystemService systemService;

    public SystemController(SystemService systemService) {
        this.systemService = systemService;
    }

    @GetMapping("/status")
    public SystemStatusResponse getStatus() {
        return systemService.checkStatus();
    }

    @GetMapping("/info")
    public SystemInfoResponse getInfo() {
        return systemService.getSystemInfo();
    }
}
