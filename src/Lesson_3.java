import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        /*int[][] a = new int[4][];
        a[0] = new int[]{1,2,3,4};
        a[1] = new int[]{1,1};
        a[2] = new int[]{2};
        a[3] = new int[]{1,1,1,1,1,1};
        System.out.println(Arrays.deepToString(a));  //преобразование toString для однострочного
*/
        //int[] a = {5, 4, 1, 2, 3, 9, 7, 8, 6};
        /*System.out.println(Arrays.toString(a));
        revent(a);
        revent(a1);*/

       /* sort(a);


    }

    private static void sort(int[] a) {  //Упорядочение Ctrl+Shift+M
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
*/
   /* private static void revent(int[] a) {  //Разворот наоборот
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(a));*/


        /*int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }*/

        //System.out.println(String[]args);
        /*{
            int[] arr = {10, 20, 30, 40};
            int pos = Arrays.binarySearch(arr, 25);
            System.out.println(pos);
        }*/

        int[] arr0={1,2,3,4,5,6};
        int[] arr1={0,0,0,0,0,0,0,0};
        System.out.println("arr0: " + Arrays.toString(arr0));
        System.out.println("arr1: " + Arrays.toString(arr1));

        System.arraycopy(arr0, 1 , arr1,2,3);  //откуда // c какого элемента // куда // ложить в // сколько элементов
        System.out.println("arr1: " + Arrays.toString(arr1));

        //todo регистрация на гитхабе

        System.out.println("hi");

    }

}




