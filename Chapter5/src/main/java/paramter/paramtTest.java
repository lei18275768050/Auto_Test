package paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramtTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest(String name, int age){
        System.out.println("name = " + name + ";" + " age = " + age);

    }
}
