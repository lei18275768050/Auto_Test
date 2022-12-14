package paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name = " + name + "; age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 18},
                {"wangwu", 30}
        };
        return o;
    }

    @Test(dataProvider = "method")
    public void test1(String name, int age){
        System.out.println("test1方法 name = " + name + "; age = " + age);

    }

    @Test(dataProvider = "method")
    public void test2(String name, int age){
        System.out.println("test2方法 name = " + name + "; age = " + age);
    }

    @DataProvider(name = "method")
    public Object[][] methodDataTest(Method method){
        Object [][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan", 20},
                    {"lisi", 18}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu", 60},
                    {"shanhai", 50}
            };
        }
        return result;

    }
}
