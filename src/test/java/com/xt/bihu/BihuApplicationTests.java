package com.xt.bihu;

import com.xt.bihu.util.GenerateFakeData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BihuApplicationTests {

    @Test
    void contextLoads() {
        GenerateFakeData generateFakeData = new GenerateFakeData();
        generateFakeData.generateData(1000);
    }

}
