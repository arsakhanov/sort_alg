package bblsort;


import Interface.Isort;

/**
 * Created by NM on 05.08.2018.
 */
public class BubbleSort implements Isort {

    static public void example (int[] bbsort){
        int chislo = 0;
        for (int i = bbsort.length-1; i > 0; i--)
        {for (int j = 0; j < i; j++) {
            if (bbsort[j] > bbsort[j + 1]) {
                chislo = bbsort[j];
                bbsort[j] = bbsort[j + 1];
                bbsort[j + 1] = chislo;
            }
        }
        }
    }

    public void sort(int[] arr1) {
        example(arr1);
    }

    public  void print(int[] arr1Sorted) {
        System.out.println("Пузырьковая сортировка");
        for (int i = 0; i < arr1Sorted.length; i++)
        {
            System.out.print(arr1Sorted[i] + " ");
        }

    }
}
