public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Task 1");
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

    }

    private static void task2() {
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Task 3");
        for (int b = 0; b < 17; b = b + 2) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Task 4");
        for (int c = 10; c >= -10; c--) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Task 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным ");
            }
        }
    }

    private static void task6() {
        System.out.println("Task 6");
        for (int c = 7; c <= 98; c = c + 7) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Task 7");
        for (int c = 1; c <= 512; c = c * 2) {
            System.out.print(c + " " );
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Task 8");

        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накопление равна " + total + " рублей");

        }
    }
}

