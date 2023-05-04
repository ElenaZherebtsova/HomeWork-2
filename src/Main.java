public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1
        var box = 5;
        System.out.println ("box = " + box);

        box = box / 3;
        System.out.println ("box = " + box);

    }

    public static void task2 () {
        System.out.println("Задача 2");
         // Пишем код для задачи 2
        var weight = 5;
        System.out.println ("weight = " + weight);

        weight = weight % 3;
        System.out.println ("остаток = " + weight);

    }
}