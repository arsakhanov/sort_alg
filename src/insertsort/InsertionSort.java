package insertsort;

import Interface.Isort;

/**
 * Created by NM on 06.08.2018.
 */
public class InsertionSort implements Isort{
    static public void InSort(int[] mas){
        int tmp = 0;
        for (int i = 1; i < mas.length; i++){
            for (int j = i; j > 0 && mas[j-1] > mas[j]; j--){
                tmp = mas[j-1];
                mas[j-1] = mas[j];
                mas[j] = tmp;
            }
        }
    }


    public void sort(int[] arr3) {
        InSort(arr3);
    }

    public void print(int[] arr1InsSorted) {
        for (int i = 0; i < arr1InsSorted.length; i++){
            System.out.print(arr1InsSorted[i] + " ");
        }
    }
}
