import org.testng.Assert;
import org.testng.annotations.*;

public class TestGradle {

    ForTest f;

    @BeforeClass
    public static void createObject() {
        System.out.println("BeforeClass");
    }

    @BeforeTest
    public void setUp() throws Exception {
        f = new ForTest();
    }

    @Test
    public void testMaven2() throws Exception {

        System.out.println("testMaven2");
        Assert.assertEquals(4, f.sum(2, 2));
    }

    @Test
    public void testMaven3() throws Exception {
        System.out.println("testMaven3");
        Assert.assertEquals(11, 11);
    }

    @Test
    public void testMaven4() throws Exception {
        System.out.println("testMaven4");
        Assert.assertEquals(11, 11);
    }

    @Test
    public void testMaven5() throws Exception {
        System.out.println("testMaven5");
        Assert.assertEquals(11, 11);
    }

    @Test
    public void testMaven6() throws Exception {
        System.out.println("testMaven6");
        Assert.assertEquals(11, 11);
    }

    @AfterTest
    public void tearDown() throws Exception {
        System.out.println("After testMaven6");
    }
}

