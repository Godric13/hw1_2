public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        byte a = 1;
        short b = 10;
        int c = 100;
        long d = 1000L;
        float e = 1.5f;
        double f = 25.55;
        char g = 0;
        boolean h = false;
        // Задание 2
        float boxer1 = 75.2f;
        float boxer2 = 82.7f;
        float summBoxers = boxer1 + boxer2;
        System.out.println ("Общий вес двух бойцов составляет " + summBoxers);
        float diffBoxers = boxer1 - boxer2;
        System.out.println ("Разница в весе составляет " + diffBoxers);
        //Задание 3
        var bananas = 5 * 80;
        var milk = 2 * 105;
        var icecream = 2 * 100;
        var egg = 4 * 70;
        var summFood = bananas + milk + icecream + egg;
        System.out.println ("Вес еды " +summFood + " гр.");
        //Задание 4
        var weight1 = 7000 / 250;
        var weight2 = 7000 / 500;
        System.out.println ("Если спортсмен будет худеть на 250гр в день ему потребуется " + weight1 + " дней");
        System.out.println ("Если спортсмен будет худеть на 250гр в день ему потребуется " + weight2 + " дней");
        //Задание 4
        var salaryMasha = 67760;
        var salaryDenis = 83690;
        var salaryKris = 76230;
        var newSalaryMasha = salaryMasha * 1.1f;
        var newSalaryDenis = salaryDenis * 1.1f;
        var newSalaryKris = salaryKris * 1.1f;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newSalaryMasha - salaryMasha) + " рублей");
        System.out.println("Маша теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryDenis- salaryDenis) + " рублей");
        System.out.println("Маша теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + (newSalaryKris- salaryKris) + " рублей");





    }
}