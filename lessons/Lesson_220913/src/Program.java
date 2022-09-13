import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // value-types, типы значения
        // Целочисленные
        byte bVal = 0;   // 1 байт
        short sVal = 03341;  // 2 байта
        int iVal = 0xff13;   // 4 байта
        long lVal = 0b01101; // 8 байт

        // Символы
        char cVar = '\\';  // 2 байта

        // Булевый тип
        boolean boVal = true;  // false

        // Действительные числа
        float fVal = 0.0f;  // 4 байта, одинарная точность
        double dVal = 1.45e6;  // 8 байт, двойная точность
        //--------------------------------------------------------------------
        String strVal = "My string";
        System.out.println(strVal);

        // Арифметика
        //
        // + - сложение
        // - - вычитание
        // * - умножение
        // / - деление
        // % - остаток от деление (деление по модулю)
        //
        // +=, -=, *=, /=, %=
        // a = a + 10  ~  a += 10
        //
        // ++, -- - инкремент, декремент (префиксная, постфиксная)
        // = - присваивание

        int a = 10;
        int b = 10;
        System.out.println(a++);
        System.out.println(++b);
        System.out.println();
        System.out.println(a);
        System.out.println(b);

        // Деление работает по разному, в зависимости от контекста
        // Если оба операнда целые, то деление работает как целочисленное деление
        // (при делении дробная часть отбрасывается)
        // Если же хотя бы один операнд действительный, то деление работае как
        // арифметическое деление

        System.out.println(19 / 10);
        System.out.println(19 / 10.0);

        // Ввод
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        System.out.printf("Number: %d", nextInt);
    }
}
