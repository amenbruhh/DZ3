public class Main {
    public static void main(String[] args) {

        // задача 1

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);




        // задача 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);




        // задача 3

        dog = (int) (dog - 3.6);
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);




        // задача 4

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);




        // задача 5

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);




        // задача 6

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;

        System.out.println(totalWeight);

        var weightDifference = boxerWeight2 - boxerWeight1;

        System.out.println(weightDifference);




        // задача 7

        var remainder = boxerWeight2 % boxerWeight1;

        System.out.println(remainder);




        // задача 8

        var totalTime = 640;
        var timeOfOne = 8;
        var employees = totalTime / timeOfOne;

        System.out.println("Всего работников в компании — " + employees + " человек");

        var moreEmployees = employees + 94;
        var timeForMoreEmployees = moreEmployees * 8;

        System.out.println("Если в компании работает " + moreEmployees + " человек, то всего " + timeForMoreEmployees + " часов работы может быть поделено между сотрудниками");
    }
}

