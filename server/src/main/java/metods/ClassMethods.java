package metods;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ClassMethods {

    public ClassMethods(){

    }


    /*
     *
     * 1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
     * Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
     * идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
     * иначе в методе необходимо выбросить RuntimeException. Написать набор тестов для этого метода
     * (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
     * */

    public static int [] method1(int [] array){

        int pozithEdnFour = 0;
        int element;

        for (int i = 0; i < array.length; i++) {

            element = array[i];

            if(element == 4){
                pozithEdnFour = i;
            }

        }

        if(pozithEdnFour==0){
            throw new RuntimeException();
        }

            int [] findArray = new int[array.length-pozithEdnFour-1];

        if(pozithEdnFour != 0){

            int movePosithion = pozithEdnFour+1;
            for (int i = (movePosithion); i < array.length ; i++) {
               findArray[i - movePosithion] = array[i];
            }
        }

        return findArray;
    }

    /*
    * 2. Написать метод, который проверяет состав массива из чисел 1 и 4.
    * Если в нем нет хоть одной четверки или единицы, то метод вернет false;
    * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
    * */

    public static boolean method2(int [] array){

        int keyOne = Arrays.binarySearch(array, 1);
        int keyTwo = Arrays.binarySearch(array, 4);

        if (keyOne >= 0 || keyTwo >= 0){
            return true;
        }

        return false;
    }


}
