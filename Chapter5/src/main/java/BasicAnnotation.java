import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是第一个测试用例");
    }


    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforMethod(){

        System.out.println("beformethod这是在测试用例之前执行的");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("aftermethod 这个用例执行之后执行的");
    }

    @BeforeClass
    public void beforClass(){
        System.out.println("beforClass这是类运行之前执行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是类执行之后执行的方法");
    }

    @BeforeSuite
    public void beforsuite(){
        System.out.println("beforsuite测试套件");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite测试套件");
    }
}
