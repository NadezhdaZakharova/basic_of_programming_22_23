import java.util.Scanner;

public class IfSwitchDemo {
    public static void main(String[] args) {
        // -------------------------------------------------------------------
        // if statement
        // -------------------------------------------------------------------
        //
        // if (<cond>)
        //     <true_statement>
        // [else
        //     <false_statement>]
        //
        // <cond> - выражение булевого типа (boolean)
        // <true_statement> - это выражение или блок, который выполняется в
        //                    случае если <cond> истина (true).
        //                    Блок - это последовательность операторов,
        //                    заключенная в {}
        // <false_statement> - это выражение или блок, который выполняется в
        //                     случае если <cond> ложь (false).
        //
        // в качестве выражений <*_statement> могут выступать другие
        // управляющие конструкции
        //
        // Пример.

//        int a = 0;
//        Scanner sc = new Scanner(System.in);
//
//        a = sc.nextInt();
//
//        if(a > 0)
//            System.out.println("positive");
//
//        if(a > 0) {
//            System.out.println("positive");
//        } else {
//            System.out.println("non positive");
//        }
//
//        if(a > 0) {
//            System.out.println("positive");
//        } else if (a == 0) {
//            System.out.println("zero");
//        } else {
//            System.out.println("negative");
//        }

        // -------------------------------------------------------------------
        // Условия
        // -------------------------------------------------------------------
        //
        // 1. Операторы сравнения
        // >, <, >=, <=, ==, !=
        //
        // 2. Логические операторы
        // && - логическое И (сокращенное)
        // || - логическое ИЛИ (сокращенное)
        // !  - логическое НЕ
        // & - логическое И
        // | - логическое ИЛИ
        // ^ - логическое ИСКЛЮЧАЮЩЕЕ ИЛИ

        // X    Y    X && Y
        // 0    0     0
        // 0    1     0
        // 1    0     0
        // 1    1     1

        // X    Y    X || Y
        // 0    0     0
        // 0    1     1
        // 1    0     1
        // 1    1     1

        // X    Y    X ^ Y
        // 0    0     0
        // 0    1     1
        // 1    0     1
        // 1    1     0

        // X    !X
        // 0    1
        // 1    0

//        int a = 0;
//        int b = 0;
//
//        if(a > 0 & (++b) > 0) {}
//
//        System.out.println(a);
//        System.out.println(b);
//
//        String s1 = "Hi";
//        String s2 = "H";
//
//        s2 += "i";
//
//        if (s1 == s2) {  // НЕПРАВИЛЬНО!!!
//            System.out.println("equals");
//        } else {
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println("Not equals");
//        }
//
//        if(s1.equals(s2))
//            System.out.println("equals");

        // -------------------------------------------------------------------
        // switch statement
        // -------------------------------------------------------------------
        //
        // switch(<value>) {
        //     case <const_1>:
        //         <statements_1>
        //     [break]
        //     case <const_2>:
        //         <statements_2>
        //     [break]
        //     ....
        //     case <const_n>:
        //         <statements_n>
        //     [break]
        //     [default:
        //         <statements_def>
        //     [break]]
        // }
        //
        // <value> - выражение порядкового типа (целые, их ссылочные оболочки,
        //           строки, перечисления)
        // <const_*> - некоторая константа соответствующего типа
        // -------------------------------------------------------------------

        String day = null;
        Scanner sc = new Scanner(System.in);
        day = sc.nextLine();

//        int number = switch (day) {
//            case "Понедельник":
//                yield 1;
//            case "Вторник":
//                yield 2;
//            case "Среда":
//                yield 3;
//            default:
//                yield -1;
//        };
        int number = switch (day) {
            case "Понедельник" -> 1;
            case "Вторник" -> 2;
            case "Среда" -> 3;
            default -> -1;
        };

//        switch (day) {
//            case "Понедельник":
//                System.out.println(1);
//                break;
//            case "Вторник":
//                System.out.println(2);
//                break;
//            case "Среда":
//                System.out.println(3);
//                break;
//            case "Четверг":
//                System.out.println(4);
//                break;
//            case "Пятница":
//                System.out.println(5);
//                break;
//            case "Суббота":
//                System.out.println(6);
//                break;
//            case "Воскресенье":
//                System.out.println(7);
//                break;
//            default:
//                System.out.println(-1);
//                break;
//        }
    }
}
