package p1;

public class Rectangle {
    // 1. Из чего состоит объект класса?
    // Для ответа на этот вопрос создаем ПОЛЯ КЛАССА
    //
    // Синтаксис создания поля класса
    // [<mod>] [static] [final] <type> <name> [= <default_value>];
    //
    // Допускается объявление нескольких полей одного типа
    // через запятую.

    private float width;
    private float height;


    // 2. Какую функциональность предоставляет класс?
    // Для ответа на этот вопрос создаем МЕТОДЫ
    //
    // Синтаксис создания метода класса
    // [<mod>] [static] [final] <type> <name>(<arg_list>) { <body> }
    //
    // Важно: методы (не статические) имеют неограниченный доступ к
    // любым другим нестатическим членам класса (полям и другим методам)
    //
    // Важно: методы (статические) имеют неограниченный доступ только к
    // другим статическим членам класса (полям и другим методам)

    public float square() {
        return width * height;
    }
    public float perimeter() {
        return (width + height) * 2;
    }

    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }
    public void setWidth(float value) {
        width = value;
    }
    public void setHeight(float value) {
        height = value;
    }


    // 3. Как создать объкт класса?
    // Для ответа на этот вопрос создаем КОНСТРУКТОРЫ
    //
    // Синтаксис создания конструктора
    // [<mod>] <class_name>(<arg_list>) { <body> }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(float side) {
        width = height = side;
    }
    public Rectangle() {
        width = height = DefaultSide;
    }

    static final float DefaultSide = 10;
}
