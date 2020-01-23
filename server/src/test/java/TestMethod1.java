import metods.ClassMethods;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/*
* 1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
* Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
*  идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
*  иначе в методе необходимо выбросить RuntimeException. Написать набор тестов для этого метода
* (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
 *
* */

public class TestMethod1 {
    ClassMethods method;

    @Before
    public void prepare(){
        method = new ClassMethods();
    }

    @Test
    public void testFindOneFour(){

        int[] array = {1,2,3,4,3};
        int[] arrayResult = {3};

        Assert.assertArrayEquals(arrayResult,
                method.method1(array));

    }

    @Test
    public void testFindTwoFour(){

        int[] array = {1,2,3,4,3,3,4,333,444,555};
        int[] arrayResult = {333,444,555};

        Assert.assertArrayEquals(arrayResult,
                method.method1(array));

    }

    @Test
    public void testThrowErr(){

        int[] array = {1,2,3,3,3,333,444,555};

        try {
            method.method1(array);
            Assert.fail();
        }catch (RuntimeException e){
            Assert.assertTrue(true);
        }

    }

}
