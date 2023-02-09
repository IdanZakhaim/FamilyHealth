public class Child {
    private String name;
    private boolean boy;
    private int year;
    private int month;

    public Child(String name, boolean boy, int year, int month) {
        this.name = name;
        this.boy = boy;
        this.year = year;
        this.month = month;
    }


    public boolean isBoy() {
        return boy;
    }


    public int getMonth() {
        return month;
    }


    protected boolean isOlder(Child child) {
        boolean older = false;
        if (child.year < this.year) {
            older = true;
        }
        return older;
    }

    protected boolean isOlderThanYear(Child child, int year) {
        boolean older = false;
        if (child.year < year) {
            older = true;
        }
        return older;
    }

    protected static Child[] boys(Child[] children) {
        int boysCounter = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i].isBoy()) {
                boysCounter++;
            }
        }
        Child[] boysArr = new Child[boysCounter];

        for (int i = 0; i < children.length; i++) {
            for (int j = 0; j < boysArr.length; j++) {
                if (children [i].isBoy()) {
                    if (boysArr[j] == null) {
                        boysArr[j] = children[i];
                        break;
                    }
                }
            }
        }
  return boysArr;
}

    protected static Child[] girls (Child[] children) {
        int girlsCounter = 0;
        for (int i = 0; i < children.length; i++) {
            if (!children[i].isBoy()) {
                girlsCounter++;
            }
        }
        Child[] girlsArr = new Child[girlsCounter];
        for (int i = 0; i < children.length; i++) {
            for (int j = 0; j < girlsArr.length; j++) {
                if (!children[i].isBoy()) {
                    if (girlsArr[j] == null) {
                        girlsArr[j] = children[i];
                        break;
                    }
                }
            }
        }
        return girlsArr;
    }


    protected static int mostCommonMonth(Child[] children) {
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int count = 0;
        int mostCommonMonth = 0;
        int count2 = 0;
        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < children.length; j++) {
                if (children[j].getMonth() == months[i]) {
                    count++;
                    if (count > count2) {
                        count2 = count;
                        count = 0;
                        mostCommonMonth = months[i];
                    }
                }
            }
        }
        return mostCommonMonth;
    }

    protected static float averageArr (Child [] children){
        int kidAge = 0;
        for (int i = 0; i < children.length; i++) {
            kidAge += 2023 - children[i].year;
        }
        return  (float) kidAge/children.length;
    }
    }
