package lab4;

public class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat(5,45.0,"Lucy");

        cat.move();
        cat1.moveTwo(20);

        cat.status();
        cat1.status();
    }
}
