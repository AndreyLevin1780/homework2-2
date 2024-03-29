public class Hufflepuff extends Hogwarts{

    private final int diligence;
    private final int fidelity;
    private final int honesty;

    public Hufflepuff(String fullName, int magic, int transgression, int diligence, int fidelity, int honesty) {
        super(fullName, magic, transgression);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return  "Имя: " + getFullName() +
                ", магия: " + getMagic() +
                ", трансгрессия: " +getTransgression() +
                ", трудолюбие: " + getDiligence() +
                ", верность: " + getFidelity() +
                ", честность: " + getHonesty() +
                ".";
    }

    public void printStudent(Hufflepuff student) {
        System.out.println();
        System.out.println(this.toString());
    }

    public void compareStudents(Hufflepuff student) {

        if (this.getDiligence() < 0 || this.getFidelity() < 0 || this.getHonesty() < 0 || student.getDiligence() < 0 || student.getFidelity() < 0 || student.getHonesty() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
        } else if (this.getDiligence() > 100 || this.getFidelity() > 100 || this.getHonesty() > 100 || student.getDiligence() > 100 || student.getFidelity() > 100 || student.getHonesty() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = this.getDiligence() + this.getFidelity() + this.getHonesty();
        int student2totalScore = student.getDiligence() + student.getFidelity() + student.getHonesty();

        System.out.println("У " + this.getFullName() +
                " трудолюбивость = " + this.getDiligence() + " баллов, " +
                "верность = " + this.getFidelity() + " баллов, " +
                "честность = " + this.getHonesty() + " баллов.");
        System.out.println("У " + student.getFullName() +
                " трудолюбивость = " + student.getDiligence() + " баллов, " +
                "верность = " + student.getFidelity() + " баллов, " +
                "честность = " + student.getHonesty() + " баллов.");
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(this.getFullName() + " лучший Пуффендуец, чем " + student.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student.getFullName() + " лучший Пуффендуец, чем " + this.getFullName() + ".");
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
