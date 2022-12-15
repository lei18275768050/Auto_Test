package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的test1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的test2");

    }

    @Test(groups = "client")
    public void test11(){
        System.out.println("这是客户端组的test1");
    }

    @Test(groups = "client")
    public void test22(){
        System.out.println("这是客户端组的test2");

    }

    @BeforeGroups(groups = "server")
    public void beforGroupsOnServer(){
        System.out.println("这是服务端组运行之前的方法");
    }

    @AfterGroups(groups = "server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后的方法");
    }

    @BeforeGroups(groups = "client")
    public void beforGroupsOnClient(){
        System.out.println("这是客户端组运行之前的方法");
    }

    @AfterGroups(groups = "client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后的方法");
    }


}
