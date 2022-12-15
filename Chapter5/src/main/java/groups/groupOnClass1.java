package groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupOnClass1 {
    public void stu1(){
        System.out.println("groupOnClass1中的stu1");
    }

    public void stu2(){
        System.out.println("groupOnClass1中的stu2");
    }

    public void stu3(){
        System.out.println("groupOnClass1中的stu3");
    }
}
