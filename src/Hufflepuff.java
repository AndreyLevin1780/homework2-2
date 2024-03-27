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

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {

        if (student1.getDiligence() < 0 || student1.getFidelity() < 0 || student1.getHonesty() < 0 || student2.getDiligence() < 0 || student2.getFidelity() < 0 || student2.getHonesty() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
        } else if (student1.getDiligence() > 100 || student1.getFidelity() > 100 || student1.getHonesty() > 100 || student2.getDiligence() > 100 || student2.getFidelity() > 100 || student2.getHonesty() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = student1.getDiligence() + student1.getFidelity() + student1.getHonesty();
        int student2totalScore = student2.getDiligence() + student2.getFidelity() + student2.getHonesty();

        System.out.println("У " + student1.getFullName() +
                " трудолюбивость = " + student1.getDiligence() + " баллов, " +
                "верность = " + student1.getFidelity() + " баллов, " +
                "честность = " + student1.getHonesty() + " баллов.");
        System.out.println("У " + student2.getFullName() +
                " трудолюбивость = " + student2.getDiligence() + " баллов, " +
                "верность = " + student2.getFidelity() + " баллов, " +
                "честность = " + student2.getHonesty() + " баллов.");
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(student1.getFullName() + " лучший Пуффендуец, чем " + student2.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student2.getFullName() + " лучший Пуффендуец, чем " + student1.getFullName() + ".");
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
