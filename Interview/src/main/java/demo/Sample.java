package demo;

import java.util.Arrays;

public class Sample {


    // merge two arrays
    // Input :sorted arrays { 2,4,6,8} { 1,3,5,9}
    // Output : {1,2,3,4,5,6,8,9}

    public static void main(String[] a){
        int a1[] = { 2,4,6,8};
        int a2[] = { 1,3,5,9};
        new Sample().merge(a1,a2);
    }

    private void merge(int a1[], int a2[]){
        int merge[] = new int[a1.length + a2.length];

        for(int i=0 ; i< a1.length;i++){
            merge[i] = a1[i];
        }

        for(int i=0 ; i< a2.length;i++){

            merge[a1.length+i] = a2[i];
        }
        System.out.println(merge);
        for(int i=0 ; i< merge.length;i++){
            System.out.println(merge[i]);
        }

        // now sort it
        // Approach 1st
        for (int i = 0; i < merge.length; i++) {
            for (int j = i+1 ; j < merge.length ; j++) {
                if (merge[i] > merge[j]) {
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }

            }
        }

        for(int i=0 ; i< merge.length;i++){
            System.out.print(merge[i]);
        }
        // Approach 2nd
        int merge2[] = new int[a1.length + a2.length];
        System.arraycopy(a1,0,merge2,0,a1.length);
        System.arraycopy(a2,0,merge2,a1.length,a2.length);

        System.out.println(" ");
        for(int i=0 ; i< merge2.length;i++){
         //   System.out.print(merge2[i]);
            // now again sort it
        }
    }
}
