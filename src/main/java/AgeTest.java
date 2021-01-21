import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeTest {

    public boolean ageTest(int age) {
        return (age >= 0 && age <= 120);
    }

    @Test
    public void test1(){
        boolean result = ageTest(119);
        Assert.assertEquals(result, true);
    }
    @Test
    public void test2(){
        boolean result = ageTest(120);
        Assert.assertEquals(result, true);
    }
    @Test
    public void test3(){
        boolean result = ageTest(121);
        Assert.assertEquals(result, false);
    }
    @Test
    public void test4(){
        boolean result = ageTest(-1);
        Assert.assertEquals(result, false);
    }
    @Test
    public void test5(){
        boolean result = ageTest(0);
        Assert.assertEquals(result, true);
    }
}