package main;
import Interface.Isort;
import Interface.ISearch;
import bblsort.BubbleSort;
import binarySearch.BinarySearch;
import files.WriteReadFile;

/**
 * Created by NM on 05.08.2018.
 */
public class Main {


    public static void main(String[] args) {

        System.setProperty("console.encoding","Cp866");
        System.out.println("Hello, world!!!");

        System.out.println();

        //WriteReadFile.read();
        int [] arr1 = {23, 3, 54 , -1, 343, 10, 7, 44, 100};
        //int [] arr2 = {23, 3, 54 , -1, 343, 10, 3, 44};
       // int [] arr3 = {23, 3, 54 , -1, 343, 10, 3, 44};
       // int [] arr4 = {-23, 3, 5 , 11, 33, 100, 123, 344};
        Isort sort = new BubbleSort();
        sort.sort(arr1);
        int [] mas2 = arr1;
        sort.print(arr1);


        System.out.println('\n' + "BinerySearch:");
        ISearch search = new BinarySearch();
        search.search(mas2, 100);


        /*
        System.out.println('\n' + "Шейкерная сортировка:");
        ShakerSort.shaker();


        System.out.println('\n' + "Быстрая сортировка:");
        int start = 0;
        int end = arr2.length-1;
        Isort qsort  = new QSort();
        qsort.sort(arr2);
        qsort.print(arr2);

        System.out.println('\n' + "InsertionSort:");
        Isort insort = new InsertionSort();
        insort.sort(arr3);
        insort.print(arr3);*/



    }





}
