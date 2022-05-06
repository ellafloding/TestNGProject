import org.testng.annotations.*;

public class TestAnnotations {

    @BeforeClass ()
    void beforeClass(){
        System.out.println("This will execute before the class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after the class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @Test (testName = "Test 1")
    void setup(){
        System.out.println("This is test 1");
    }

    @Test(testName = "Test 2", priority = 1)
    void login(){
        System.out.println("This is test 2");
    }

    @Test (testName = "Test 3", priority = 2)
    void teardown(){
        System.out.println("This is test 3");
    }
}
