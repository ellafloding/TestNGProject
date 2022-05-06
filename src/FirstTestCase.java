import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTestCase {


    @Test(testName = "Addition test", priority = -1, groups = {"basic"}, dependsOnMethods = {"subtractTest"})
    public void addTest(){

//        System.out.println("Addition test");
        Math calculator = new Math();
        Assert.assertEquals(calculator.add(1, 5), 6);

    }

    @Test (testName = "Subtraction test", groups = {"basic"}, dataProvider = "getDataSub")
    public void subtractTest(int a, int b, int expected){

//        System.out.println("Subtraction test");
        Math calculator = new Math();
        Assert.assertEquals(calculator.subtract( a, b), expected);
    }

    @Test (testName = "Multiplication Test", groups = {"advanced"}, dataProvider = "getDataMultiplication")
    public void multiplicationTest(int a, int b, int expected){

//        System.out.println("Multiplication test");
        Math calculator = new Math();
        Assert.assertEquals(calculator.multiplication( a, b), expected);
    }

    @Test (testName = "Division Test", groups = {"advanced"}, dataProvider = "getDataDivision")
    public void divisionTest(int a, int b, int expected){

//        System.out.println("Division test");
        Math calculator = new Math();
        Assert.assertEquals(calculator.division( a, b), expected);
    }

    @Test (enabled = false)
    public void disabledTest(){
        System.out.println("This test should be disabled");
    }

    @DataProvider
    public Object[][] getDataSub(){
        Object[][] data = new Object[2][3];
        data[0][0] = 1;
        data[0][1] = 2;
        //deliberate mistake to fail subtractTest
        data[0][2] = -3;

        data[1][0] = 4;
        data[1][1] = 3;
        data[1][2] = 1;

        return data;
    }

    @DataProvider
    public Object[][] getDataMultiplication(){
        Object[][] data = new Object[2][3];
        data[0][0] = 1;
        data[0][1] = 2;
        //deliberate mistake to fail subtractTest
        data[0][2] = 2;

        data[1][0] = 4;
        data[1][1] = 3;
        data[1][2] = 12;

        return data;
    }

    @DataProvider
    public Object[][] getDataDivision(){
        Object[][] data = new Object[2][3];
        data[0][0] = 2;
        data[0][1] = 2;
        //deliberate mistake to fail subtractTest
        data[0][2] = 1;

        data[1][0] = 12;
        data[1][1] = 3;
        data[1][2] = 4;

        return data;
    }
}

