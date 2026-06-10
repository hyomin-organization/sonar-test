package me.hyomin.sonartest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private final BasicService basicService;

    public BasicController(BasicService basicService) {
        this.basicService = basicService;
    }

    @GetMapping("/")
    public String basic(){
        return basicService.basic();
    }

    @GetMapping("/2")
    public String basic2(){
        return basicService.basic2();
    }
    @GetMapping("/3")
    public String basic3(){
        return basicService.basic3();
    }
    @GetMapping("/4")
    public String basic4(){
        return basicService.basic4();
    }
    @GetMapping("/")
    public String basic5(){
        return basicService.basic5();
    }
    @GetMapping("/")
    public String basic6(){
        return basicService.basic6();
    }
    @GetMapping("/7")
    public String basic7(){
        return basicService.basic7();
    }
    @GetMapping("/8")
    public String basic8(){
        return basicService.basic8();
    }
    @GetMapping("/9")
    public String basic9(){
        return basicService.basic9();
    }
    @GetMapping("/10")
    public String basic10(){
        return basicService.basic10();
    }


}
