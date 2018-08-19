package shakersort;

/**
 * Created by NM on 05.08.2018.
 */
public class ShakerSort {
        static public void shaker() {
            int[] mas = {5, 4, 2, 0, 1, 3, 6, 9, 8, 7};
            int min = 0;
            int temp = 0;
            for (int i = 1; i < mas.length-1; i++) {
                for (int j = mas.length - 1; j > i; j--) {
                    if (mas[j] < mas[j-1]){
                        min = mas[j];
                        mas[j] = mas[j-1];
                        mas[j-1] = min;
                    }
                   for (int k = 0; k < j; k++){
                       if(mas[k] > mas[k+1])
                       {
                         temp = mas[k];
                         mas[k] = mas[k+1];
                         mas[k+1] = temp;
                       }
                    }
                }
            }
            for (int i = 0; i < mas.length; i++)
            {
                System.out.print(mas[i] + " ");
            }
        }
}

