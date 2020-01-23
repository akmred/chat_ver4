import metods.ClassMethods;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMethod2 {

    ClassMethods method;

    @Before
    public void prepare(){
        method = new ClassMethods();
    }

    @Test
    public void testFindOneFour(){

        int[] array = {1,2,3,4,3};

        Assert.assertTrue(method.method2(array));

    }

    @Test
    public void testFindOneFourBigArray(){

        int[] array = {1,2,3,4,3,4,5,666,444,333,2,3,4,5,56,6,77,6,66};

        Assert.assertTrue(method.method2(array));

    }

    @Test
    public void testFindOneFourNo(){

        int[] array = {2,3,664,3};

        Assert.assertFalse(method.method2(array));

    }

}
