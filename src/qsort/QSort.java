package qsort;

import Interface.IInterfacable;
import Interface.Isort;


/**
 * Created by NM on 05.08.2018.
 */
public class QSort implements Isort, IInterfacable {
    static public int[] quick(int[] mas, int start, int end){
        if (start >= end)
        {
            return mas;
        }
        int tmp = 0;
        int i = start;
        int j = end;
        int p = i - (i - j)/2;
        while (i < j){
           while (i < p && mas[i] <= mas[p])
           {i++;}
           while (j > p && mas[p] <= mas[j])
           { j--;}
           if (i<j) {
               tmp = mas[i];
               mas[i] = mas[j];
               mas[j] = tmp;
               if (i == p)
                   p = j;
               else if (j == p)
                   p = i;
           }
            quick(mas,start, p);
            quick(mas,p+1, end);
       }
        return mas;
    }

    public void sort(int[] arr2) {

    }

    public void print(int[] arr1Qsorted) {

        for (int i = 0; i < arr1Qsorted.length; i++)
        {
            System.out.print(arr1Qsorted[i] + " ");
        }

    }

    @Override
    public void someMethod() {

    }
}
