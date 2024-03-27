public class Slytherin extends Hogwarts{

    private final int craftiness;
    private final int resoluteness;
    private final int ambitiousness;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String fullName, int magic, int transgression, int craftiness, int resoluteness, int ambitiousness, int resourcefulness, int lustForPower) {
        super(fullName, magic, transgression);
        this.craftiness = craftiness;
        this.resoluteness = resoluteness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCraftiness() {
        return craftiness;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {

        if (student1.getCraftiness() < 0 || student1.getResoluteness() < 0 || student1.getAmbitiousness() < 0 || student1.getResourcefulness() < 0 || student1.getLustForPower() < 0 || student2.getCraftiness() < 0 || student2.getResoluteness() < 0 || student2.getAmbitiousness() < 0 || student2.getResourcefulness() < 0 || student2.getLustForPower() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
        } else if (student1.getCraftiness() > 100 || student1.getResoluteness() > 100 || student1.getAmbitiousness() > 100 || student1.getResourcefulness() > 100 || student1.getLustForPower() > 100 || student2.getCraftiness() > 100 || student2.getResoluteness() > 100 || student2.getAmbitiousness() > 100 || student2.getResourcefulness() > 100 || student2.getLustForPower() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = student1.getCraftiness() + student1.getResoluteness() + student1.getAmbitiousness() + student1.getResourcefulness() + student1.getLustForPower();
        int student2totalScore = student2.getCraftiness() + student2.getResoluteness() + student2.getAmbitiousness() + student2.getResourcefulness() + student2.getLustForPower();

        System.out.println("У " + student1.getFullName() +
                " хитрость = " + student1.getCraftiness() + " баллов, " +
                "решительность = " + student1.getResoluteness() + " баллов, " +
                "амбициозность = " + student1.getAmbitiousness() + " баллов, " +
                "находчивость = " + student1.getResourcefulness() + " баллов, " +
                "жажда власти = " + student1.getLustForPower());
        System.out.println("У " + student2.getFullName() +
                " хитрость = " + student2.getCraftiness() + " баллов, " +
                "решительность = " + student2.getResoluteness() + " баллов, " +
                "амбициозность = " + student2.getAmbitiousness() + " баллов, " +
                "находчивость = " + student2.getResourcefulness() + " баллов, " +
                "жажда власти = " + student2.getLustForPower());
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(student1.getFullName() + " лучший Слизеринец, чем " + student2.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student2.getFullName() + " лучший Слизеринец, чем " + student1.getFullName() + ".");
            System.out.println();
        } else {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + " сумма баллов равна " + student2totalScore + ".");
            System.out.println("Студенты по баллам равны.");
            System.out.println();
        }

    }
}
