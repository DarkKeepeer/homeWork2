public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Вес собаки " + dog + " кг.");
        System.out.println("Вес кошки " + cat + " кг.");
        System.out.println("У нас есть " + paper + " листов бумаги!");

        dog = dog + 4;
        System.out.println("Теперь вес собаки " + dog + " кг!");
        cat = cat + 4;
        System.out.println("Теперь вес кошки " + cat + " кг!");
        paper = paper + 4;
        System.out.println("Тепрь у нас стало " + paper + " листов бумаги.");

        dog = dog - 3.5;
        System.out.println("Теперь вес собаки " + dog + " кг.");
        cat = cat - 1.6;
        System.out.println("Теперь вес кошки " + cat + " кг.");
        paper = paper - 7639;
        System.out.println("Теперь у нас осталось " + paper + " листов бумаги.");

        var friend = 19;
        System.out.println("У меня появилось " + friend + " новых друзей!");
        friend = friend + 2;
        System.out.println("А сейчас у меня уже " + friend + " новый друг!");
        friend = friend / 7;
        System.out.println("За последний час у меня появилось " + friend + " новых дргуа!");

        var frog = 3.5;
        System.out.println("Чтобы накормить француза нужно " + frog + " лягушки.");
        frog = frog * 10;
        System.out.println("Чтобы накормить 10 французов нужно " + frog + " лягушек!");
        frog = frog / 3.5;
        System.out.println(frog + " Именно столько французов можно накомить 35-ю ляушками!");
        frog = frog + 4;
        System.out.println("На обед Франсуа купил " + frog + " лягушек!");

        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера " + firstBoxerWeight + " кг.");
        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера " + secondBoxerWeight + " кг.");
        var totalWeightOfBoxers = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух боксеров " + totalWeightOfBoxers + " кг!");
        var boxerWeightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Первый боксер легче второго на " + boxerWeightDifference + " кг.");

        var differenceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления между двумя весами " + differenceWeight + " кг.");

        var workTime = 640;
        var workingTimeOfOneEmployee = 8;
        var totalEmployees = workTime / workingTimeOfOneEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек!");

        totalEmployees = totalEmployees + 94;
        workTime = totalEmployees * workingTimeOfOneEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + workTime + " часов работы может быть поделено между сотрудниками.");

    }
}