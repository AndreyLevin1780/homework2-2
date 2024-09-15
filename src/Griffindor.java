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

    public void compareStudents(Griffindor student) {

        if (this.getGenerosity() < 0 || this.getHonor() < 0 || this.getBravery() < 0 || student.getGenerosity() < 0 || student.getHonor() < 0 || student.getBravery() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
            } else if (this.getGenerosity() > 100 || this.getHonor() > 100 || this.getBravery() > 100 || student.getGenerosity() > 100 || student.getHonor() > 100 || student.getBravery() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = this.getGenerosity() + this.getHonor() + this.getBravery();
        int student2totalScore = student.getGenerosity() + student.getHonor() + student.getBravery();

        System.out.println("У " + this.getFullName() +
                " благородство = " + this.getGenerosity() + " баллов, " +
                "честь = " + this.getHonor() + " баллов, " +
                "храбрость = " + this.getBravery() + " баллов.");
        System.out.println("У " + student.getFullName() +
                " благородство = " + student.getGenerosity() + " баллов, " +
                "честь = " + student.getHonor() + " баллов, " +
                "храбрость = " + student.getBravery() + " баллов.");
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(this.getFullName() + " лучший Гриффиндорец, чем " + student.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student.getFullName() + " лучший Гриффиндорец, чем " + this.getFullName() + ".");
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
