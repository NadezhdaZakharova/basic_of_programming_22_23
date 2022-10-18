public enum EnumDemo {
    FirstConstant(1, "Первая константа"),
    SecondConstant(2, "Вторая константа"),
    ThirdConstant(3, "Третья константа");

    EnumDemo(int numberValue, String name) {
        this.numberValue = numberValue;
        this.name = name;
    }

    private int numberValue;
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
