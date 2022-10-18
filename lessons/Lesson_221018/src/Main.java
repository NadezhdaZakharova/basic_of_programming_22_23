import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList
//        ArrayList<Integer> data = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        int size = scanner.nextInt();
//
//        for (int i = 0; i < size; ++i) {
//            int temp = scanner.nextInt();
//            data.add(temp);
//        }
//
////        for (int i = 0; i < data.size(); ++i) {
////            System.out.printf("%d ", data.get(i));
////        }
//        printList(data);
//
//        data.remove(5);
//        printList(data);
//        var dataCopy = new ArrayList<>(data);
//        data.addAll(dataCopy);
//        printList(data);
//        data.addAll(3, dataCopy);
//        printList(data);
//
////        data.removeIf(Main::isEven);
//        data.removeIf(v -> v % 2 == 0);
//        printList(data);
//        data.sort(Integer::compareTo);
//        printList(data);
////        data.sort(Main::compareInteger);
//        data.sort((f, s) -> s - f);
//        printList(data);

        // HashSet
//        HashSet<Integer> data1 = new HashSet<>();
//        HashSet<Integer> data2 = new HashSet<>();
//        Scanner scanner = new Scanner(System.in);
//
//        int size1 = scanner.nextInt();
//        for (int i = 0; i < size1; ++i) {
//            int temp = scanner.nextInt();
//            data1.add(temp);
//        }
//        printSet(data1);
//
//        int size2 = scanner.nextInt();
//        for (int i = 0; i < size2; ++i) {
//            int temp = scanner.nextInt();
//            data2.add(temp);
//        }
//        printSet(data2);

//        // HashMap
//        HashMap<String, Integer> data = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < size; ++i) {
//            String key = scanner.nextLine();
//            int value = scanner.nextInt();
//            scanner.nextLine();
//            data.put(key, value);
//        }
//        printMap(data);
        EnumDemo ed = EnumDemo.FirstConstant;
        System.out.println(ed);

//        switch (ed) {
//            case FirstConstant -> System.out.println("first");
//            case SecondConstant -> System.out.println("second");
//            case ThirdConstant -> System.out.println("third");
//        }
    }

    private static int compareInteger(Integer first, Integer second) {
        return second - first;
    }

    private static boolean isEven(int v) {
        return v % 2 == 0;
    }

    private static void printList(ArrayList<Integer> data) {
        for (Integer datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println();
    }
    private static void printSet(HashSet<Integer> data) {
        for (Integer datum : data) {
            System.out.printf("%d ", datum);
        }
        System.out.println();
    }

    private static void printMap(HashMap<String, Integer> data) {
        for (String key : data.keySet()) {
            System.out.printf("%s: %d\n", key, data.get(key));
        }
        System.out.println();
    }
}