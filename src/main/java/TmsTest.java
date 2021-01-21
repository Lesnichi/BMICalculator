import org.testng.Assert;
import org.testng.annotations.Test;

public class TmsTest {

    /*
    Входные данные       Ожидаемый результат
     3                      T
     9                      T
     15                     TMS
     20                     M
     21                     /  /
     30                     TMS
     */
    public String tms(int a) {
        if (a % 3 == 0) {
            return "T";
        }
        if (a % 5 == 0) {
            return  "M";
        }
//        if (a % 3 == 0 && a % 5 == 0) {
        if (a % 15 == 0) {
            return  "TMS";
        }
        return "/  /";
    }

    @Test
    public void tmsTest1() {
        String result = tms(3);
        Assert.assertEquals(result, "T");
    }

    @Test
    public void tmsTest2() {
        String result = tms(5);
        Assert.assertEquals(result, "M");
    }

    @Test
    public void tmsTest3() {
        String result = tms(15);
        Assert.assertEquals(result, "TMS");
    }

    @Test
    public void tmsTest4() {
        String result = tms(0);
        Assert.assertEquals(result, "TMS");
    }

    @Test
    public void tmsTest5() {
        String result = tms(1);
        Assert.assertEquals(result, "/  /");
    }

    @Test
    public void tmsTest6() {
        String result = tms(-1);
        Assert.assertEquals(result, "/  /");
    }

    @Test
    public void tmsTest7() {
        String result = tms(Integer.MAX_VALUE + 1);
        Assert.assertEquals(result, "/  /");
    }

}
