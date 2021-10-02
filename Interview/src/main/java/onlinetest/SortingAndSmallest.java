package onlinetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.*/

public class SortingAndSmallest {
    public static void main(String a[]) {
        Integer array[] = {1, 2, 3};
        new SortingAndSmallest().sortArray(array);
    }

    public void sortArray1(int array[]) {
        //  System.out.println("size " + array.length);
        List targetArray = new ArrayList(Arrays.asList(array));
        Collections.sort(targetArray);
        //    targetArray.stream().forEach(item -> System.out.println(item));
        for (int i = 0; true; i++) {
            int smallest = (int) targetArray.get(0) + i;
            if (!targetArray.contains(smallest)) {
                if (smallest > 0) {
                    System.out.println("Smallest number not in list: " + smallest);
                    break;
                }

            }
        }
    }

    public void sortArray(Integer array[]) {
        //  System.out.println("size " + array.length);
        List targetArray = new ArrayList(Arrays.asList(array));
        Collections.sort(targetArray);
    //    targetArray.stream().forEach(item -> System.out.println(item));
        for (int i = 0; true; i++) {
            int smallest = (int) targetArray.get(0) + i;
            if (!targetArray.contains(smallest)) {
                if (smallest > 0) {
                    System.out.println("Smallest number not in list: " + smallest);
                    break;
                }

            }
        }
    }

}



