package suite;

import org.testng.annotations.Test;

public class timeOutTest {
    @Test(timeOut = 3000)  //单位为毫秒
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000) //程序等待3000毫秒，设置超过2000毫秒就异常，所以会执行失败
    public void testFail() throws InterruptedException{
        Thread.sleep(3000);
    }
}
