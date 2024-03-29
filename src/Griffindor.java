public class Griffindor extends Hogwarts {

private final int generosity;
private final int honor;
private final int bravery;


    public Griffindor(String fullName, int magic, int transgression, int generosity, int honor, int bravery) {
        super(fullName, magic, transgression);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getGenerosity() {
        return generosity;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Имя: " + getFullName() +
                ", магия: " + getMagic() +
                ", трансгрессия: " +getTransgression() +
                ", благородство: " + getGenerosity() +
                ", честь: " + getHonor() +
                ", храбрость: " + getBravery() +
                ".";
    }
    public static void printStudent(Griffindor student) {
        System.out.println();
        System.out.println(student.toString());
    }

    public static void compareStudents(Griffindor student1, Griffindor student2) {

        if (student1.getGenerosity() < 0 || student1.getHonor() < 0 || student1.getBravery() < 0 || student2.getGenerosity() < 0 || student2.getHonor() < 0 || student2.getBravery() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
            } else if (student1.getGenerosity() > 100 || student1.getHonor() > 100 || student1.getBravery() > 100 || student2.getGenerosity() > 100 || student2.getHonor() > 100 || student2.getBravery() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = student1.getGenerosity() + student1.getHonor() + student1.getBravery();
        int student2totalScore = student2.getGenerosity() + student2.getHonor() + student2.getBravery();

        System.out.println("У " + student1.getFullName() +
                " благородство = " + student1.getGenerosity() + " баллов, " +
                "честь = " + student1.getHonor() + " баллов, " +
                "храбрость = " + student1.getBravery() + " баллов.");
        System.out.println("У " + student2.getFullName() +
                " благородство = " + student2.getGenerosity() + " баллов, " +
                "честь = " + student2.getHonor() + " баллов, " +
                "храбрость = " + student2.getBravery() + " баллов.");
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(student1.getFullName() + " лучший Гриффиндорец, чем " + student2.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student2.getFullName() + " лучший Гриффиндорец, чем " + student1.getFullName() + ".");
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
