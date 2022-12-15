package groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class groupOnClass3 {
    public void teacher1(){
        System.out.println("groupOnClass3中的teacher1");
    }

    public void teacher2(){
        System.out.println("groupOnClass3中的teacher2");
    }

    public void teacher3(){
        System.out.println("groupOnClass3中的teacher3");
    }
}
