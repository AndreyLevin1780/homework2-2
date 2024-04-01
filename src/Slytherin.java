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

    @Override
    public String toString() {
        return  "Имя: " + getFullName() +
                ", магия: " + getMagic() +
                ", трансгрессия: " +getTransgression() +
                ", хитрость: " + getCraftiness() +
                ", решительность: " + getResoluteness() +
                ", амбициозность: " + getAmbitiousness() +
                ", находчивость: " + getResourcefulness() +
                ", жажда власти: " + getLustForPower() +
                ".";
    }


    public void compareStudents(Slytherin student) {

        if (this.getCraftiness() < 0 || this.getResoluteness() < 0 || this.getAmbitiousness() < 0 || this.getResourcefulness() < 0 || this.getLustForPower() < 0 || student.getCraftiness() < 0 || student.getResoluteness() < 0 || student.getAmbitiousness() < 0 || student.getResourcefulness() < 0 || student.getLustForPower() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
        } else if (this.getCraftiness() > 100 || this.getResoluteness() > 100 || this.getAmbitiousness() > 100 || this.getResourcefulness() > 100 || this.getLustForPower() > 100 || student.getCraftiness() > 100 || student.getResoluteness() > 100 || student.getAmbitiousness() > 100 || student.getResourcefulness() > 100 || student.getLustForPower() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = this.getCraftiness() + this.getResoluteness() + this.getAmbitiousness() + this.getResourcefulness() + this.getLustForPower();
        int student2totalScore = student.getCraftiness() + student.getResoluteness() + student.getAmbitiousness() + student.getResourcefulness() + student.getLustForPower();

        System.out.println("У " + this.getFullName() +
                " хитрость = " + this.getCraftiness() + " баллов, " +
                "решительность = " + this.getResoluteness() + " баллов, " +
                "амбициозность = " + this.getAmbitiousness() + " баллов, " +
                "находчивость = " + this.getResourcefulness() + " баллов, " +
                "жажда власти = " + this.getLustForPower());
        System.out.println("У " + student.getFullName() +
                " хитрость = " + student.getCraftiness() + " баллов, " +
                "решительность = " + student.getResoluteness() + " баллов, " +
                "амбициозность = " + student.getAmbitiousness() + " баллов, " +
                "находчивость = " + student.getResourcefulness() + " баллов, " +
                "жажда власти = " + student.getLustForPower());
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(this.getFullName() + " лучший Слизеринец, чем " + student.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student.getFullName() + " лучший Слизеринец, чем " + this.getFullName() + ".");
            System.out.println();
        } else {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + " сумма баллов равна " + student2totalScore + ".");
            System.out.println("Студенты по баллам равны.");
            System.out.println();
        }

    }
}


