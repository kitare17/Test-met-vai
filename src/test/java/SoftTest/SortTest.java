package SoftTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {
    int beforeArray[] = {29, 24, 42, 41, 27, 77, 72, 55, 57, 20, 95, 50, 68, 5, 73, 92, 18, 95, 43, 82, 15, 54, 57, 52, 44, 21, 58, 7, 98, 74, 91, 65, 85, 94, 57, 16,
            59, 99, 61, 54, 85, 68, 35, 62, 81, 51, 50, 74, 95, 26, 39, 29, 66, 65, 49, 23, 10, 93, 6, 29, 41, 13, 1, 69, 11, 77, 28, 13, 27, 7, 20, 72, 67
            , 51, 43, 77, 35, 68, 58, 37, 35, 10, 49, 9, 88, 47, 5, 96, 1, 12, 28, 43, 7, 25, 88, 15, 98, 45, 58, 73, 31, 13, 5, 37, 56, 76, 36, 64, 90, 52, 93
            , 87, 87, 4, 17, 49, 31, 81, 52, 74, 21, 20, 94, 71, 92, 26, 76, 3, 91, 43, 44, 71, 83, 88, 89, 89, 35, 92, 6, 54, 82, 82, 79, 73, 82, 54, 90, 6, 8,
            31, 17, 65, 77, 64, 29, 65, 28, 19, 69, 52, 77, 81, 73, 87, 38, 90, 98, 36, 49, 33, 25, 56, 87, 56, 96, 52, 92, 82, 9, 64, 75, 81, 37, 33, 81, 8, 20
            , 24, 15, 97, 59, 52, 25, 33, 3, 7, 58, 25, 14, 58};
    int afterArray[] = {1, 1, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 12, 13, 13, 13, 14, 15, 15, 15, 16, 17, 17, 18, 19, 20, 20, 20, 20, 21, 21, 23
            , 24, 24, 25, 25, 25, 25, 26, 26, 27, 27, 28, 28, 28, 29, 29, 29, 29, 31, 31, 31, 33, 33, 33, 35, 35, 35, 35, 36, 36, 37, 37, 37, 38, 39, 41, 41
            , 42, 43, 43, 43, 43, 44, 44, 45, 47, 49, 49, 49, 49, 50, 50, 51, 51, 52, 52, 52, 52, 52, 52, 54, 54, 54, 54, 55, 56, 56, 56, 57, 57, 57, 58, 58
            , 58, 58, 58, 59, 59, 61, 62, 64, 64, 64, 65, 65, 65, 65, 66, 67, 68, 68, 68, 69, 69, 71, 71, 72, 72, 73, 73, 73, 73, 74, 74, 74, 75, 76, 76, 77,
            77, 77, 77, 77, 79, 81, 81, 81, 81, 81, 82, 82, 82, 82, 82, 83, 85, 85, 87, 87, 87, 87, 88, 88, 88, 89, 89, 90, 90, 90, 91, 91, 92, 92, 92, 92, 93,
            93, 94, 94, 95, 95, 95, 96, 96, 97, 98, 98, 98, 99};

    //    @Test
//    public void sortTest() {
//       int expect[]=afterArray;
//       int actual[]=Sort.sortTest(beforeArray);
//        Assert.assertEquals(Arrays.toString(actual),Arrays.toString(expect));
//    }
    @Test
    public void bubblesortTest() {
        int expect[] = afterArray;
        System.out.println(Arrays.toString(beforeArray));
        int actual[] = Sort.bubbleSort(beforeArray);
        Assert.assertEquals(Arrays.toString(actual), Arrays.toString(expect));
    }

    @Test
    public void selectSortTest() {
        //ok
        int expect[] = afterArray;
        System.out.println(Arrays.toString(beforeArray));
        int actual[] = Sort.selectionSort(beforeArray);
        Assert.assertEquals(Arrays.toString(actual), Arrays.toString(expect));
    }
    @Test
    public void quickSortTest() {
        int expect[] = afterArray;
        System.out.println(Arrays.toString(beforeArray));
        int actual[] = Sort.quickSort(beforeArray,0,beforeArray.length-1);
        Assert.assertEquals(Arrays.toString(actual), Arrays.toString(expect));
    }

}