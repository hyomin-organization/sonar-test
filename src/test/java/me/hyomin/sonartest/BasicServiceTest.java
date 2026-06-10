package me.hyomin.sonartest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BasicServiceTest {

    @Autowired
    private BasicService basicService;

//    @Test
//    void basicTest(){
//        // given & when
//        String result = basicService.basic();
//
//        // then
//        assertThat(result).isEqualTo("Hello World");
//    }
}