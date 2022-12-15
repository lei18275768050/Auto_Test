package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suitConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("befor suite 运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行啦");
    }
}
