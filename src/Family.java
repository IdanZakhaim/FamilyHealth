public class Family {

    public void family() {
        int[] monthArray = new int[0];
        int year;
        Child child1 = new Child("Yaakov", true, 2020, 1);
        Child child2 = new Child("Itzhak", true, 2021, 2);
        System.out.println(child1.isOlder(child2));
        year = 2018;
        Child[] children = new Child[4];
        children[0] = child1;
        children[1] = child2;
        children[2] = new Child("Osnat", false, 2021, 3);
        children[3] = new Child("Rachel", false, 2020, 3);
        yearBirth(children, year);
        monthBirth(children);
        System.out.println(kindOfAverage(children));
    }

    public void yearBirth(Child[] children, int year) {
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isOlderThanYear(children[i], year)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void monthBirth(Child[] children) {
        Child [] boysArr = Child.boys(children);
        Child [] girlsArr = Child.girls(children);
        int boysMostCommonMonth = Child.mostCommonMonth(boysArr);
        int girlsMostCommonMonth = Child.mostCommonMonth(girlsArr);
                System.out.println("The month in which the most sons were born is: " +boysMostCommonMonth +"\n"
                +"The month in which the most girls were born is: " + girlsMostCommonMonth);
    }

    public static int kindOfAverage (Child [] children){
        int result;
        float boysAverage;
        float girlsAverage;
        Child [] boysArr = Child.boys(children);
        Child [] girlsArr = Child.girls(children);
        boysAverage = Child.averageArr(boysArr);
        girlsAverage = Child.averageArr(girlsArr);

        if (boysAverage>girlsAverage){
            result = 1;
        }
        else if (girlsAverage>boysAverage) {
            result = -1;
        }
else result = 0;
return result;
    }
}