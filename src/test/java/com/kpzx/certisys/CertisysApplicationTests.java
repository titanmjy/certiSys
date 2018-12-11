package com.kpzx.certisys;

import com.kpzx.certisys.web.TestMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.web-application-type=reactive")
public class CertisysApplicationTests {
    @Autowired
    private TestMain testMain;


    @Test
    public void contextLoads() {
        System.out.println(testMain.index());
    }

}
