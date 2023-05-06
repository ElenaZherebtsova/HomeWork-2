public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        System.out.println("Задача 2");
        // Пишем код для задачи 2
        dog = dog +4;
        cat = cat +4;
        paper = paper +4;

        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        System.out.println("Задача 3");
        // Пишем код для задачи 3
        dog = dog -3.5;
        cat = cat -1.6;
        paper = paper -7639;

        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println ("friend = " + friend);
        friend = friend +2;
        System.out.println ("friend = " + friend);
        friend = friend /7;
        System.out.println ("friend = " + friend);

        System.out.println ("Задача 5");
//        Пишем код для задачи 5
        var frog = 3.5;
        System.out.println ("frog = " + frog);
        frog = frog *10;
        System.out.println ("frog = " + frog);
        frog = frog /3.5;
        System.out.println ("frog = " + frog);
        frog = frog +4;
        System.out.println ("frog = " + frog);


        System.out.println ("Задача 6");
//        Пишем код для задачи 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        System.out.println ("Общий вес двух боксёров = " + (boxer1+boxer2));

        System.out.println ("Задача 7");

        var weightDif = boxer2 - boxer1;
        System.out.println ("Разница в весе боксёров = " + weightDif);

        weightDif = boxer2 % boxer1;
        System.out.println ("Второй боксёр тяжелее первого на " +
                weightDif + " килограмм.");

        System.out.println ("Задача 8");
        var hours = 640;
        var people = hours / 8;
        System.out.println ("Всего работников в компании - " + people);
        people = people +94;
        hours = people *8;
        System.out.println ("Если в компании работает " + people +
                " человек, то всего " + hours +
                " часов работы может быть поделено между сотрудниками.");

    }

    public static void task2 () {
        System.out.println("NEXT");
         // Пишем код для задачи 2


    }
}