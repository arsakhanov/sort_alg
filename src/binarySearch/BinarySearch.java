package binarySearch;

import Interface.ISearch;

/**
 * Created by NM on 14.08.2018.
 */
public class BinarySearch implements ISearch {

    public void search(int[] arr1, int x){
        if (arr1.length != 0) {
            int start = 0;
            int end = arr1.length;
            int middle;
            while (start < end) {
                middle = (start + end) / 2;
                if (x == arr1[middle]) {
                    System.out.println(middle);
                    break;
                } else {if (x <= arr1[middle]) {
                    end = middle;
                } else start = middle + 1;}
            }
        }
    }
}
