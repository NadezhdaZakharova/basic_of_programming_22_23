import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //--------------------------------------------------------------------
        // Массивы
        //--------------------------------------------------------------------
        /*
        <type>[] <name> [= <init>];
        <type> <name>[] [= <init>];

        <type> - тип элементов массива (тип массива)
        <name> - имя переменной массива.
        <init> - инициализирующее выражение
         */

//        int[] array_1 = new int[10];
//        int array_2[] = new int[10];
//
//        int size = 10;
//        int[] array_3 = new int[size];
//        int[] array_4 = { 1, 2, 3, 4 };
//        int[] array_5 = new int[] { 1, 2, 3, 4 };

        // ЗАдача 1.
        // =========
        // Дан массив целых чисел. Найти минимальный элемент в нем

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] data = new int[size];
        for(int i = 0; i < data.length; ++i) {
            data[i] = sc.nextInt();
        }

        int min = data[0];//Integer.MAX_VALUE;
//        for(int i = 0; i < data.length; ++i) {
//            if(min > data[i])
//                min = data[i];
//        }
        for(var v: data) {
            if(min > v)
                min = v;
        }
        System.out.println(min);

        int[][] array2d = new int[10][];
        for(int i = 1; i <= array2d.length; ++i) {
            array2d[i - 1] = new int[i];
        }
    }
}
