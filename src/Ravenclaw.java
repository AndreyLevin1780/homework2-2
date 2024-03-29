public class Ravenclaw extends Hogwarts{

    private final int wisdom;
    private final int cuteness;
    private final int creativeness;

    public Ravenclaw(String fullName, int magic, int transgression, int wisdom, int cuteness, int creativeness) {
        super(fullName, magic, transgression);
        this.wisdom = wisdom;
        this.cuteness = cuteness;
        this.creativeness = creativeness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCuteness() {
        return cuteness;
    }

    public int getCreativeness() {
        return creativeness;
    }

    @Override
    public String toString() {
        return  "Имя: " + getFullName() +
                ", магия: " + getMagic() +
                ", трансгрессия: " +getTransgression() +
                ", мудрость: " + getWisdom() +
                ", остроумие: " + getCuteness() +
                ", творчество: " + getCreativeness() +
                ".";
    }

    public void printStudent(Ravenclaw student) {
        System.out.println();
        System.out.println(this.toString());
    }
    public void compareStudents(Ravenclaw student) {

        if (this.getWisdom() < 0 || this.getCuteness() < 0 || this.getCreativeness() < 0 || student.getWisdom() < 0 || student.getCuteness() < 0 || student.getCreativeness() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
        } else if (this.getWisdom() > 100 || this.getCuteness() > 100 || this.getCreativeness() > 100 || student.getWisdom() > 100 || student.getCuteness() > 100 || student.getCreativeness() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = this.getWisdom() + this.getCuteness() + this.getCreativeness();
        int student2totalScore = student.getWisdom() + student.getCuteness() + student.getCreativeness();

        System.out.println("У " + this.getFullName() +
                " мудрость = " + this.getWisdom() + " баллов, " +
                "остроумие = " + this.getCuteness() + " баллов, " +
                "творчество = " + this.getCreativeness() + " баллов.");
        System.out.println("У " + student.getFullName() +
                " мудрость = " + student.getWisdom() + " баллов, " +
                "остроумие = " + student.getCuteness() + " баллов, " +
                "творчество = " + student.getCreativeness() + " баллов.");
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(this.getFullName() + " лучший Когтевранец, чем " + student.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + this.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student.getFullName() + " лучший Когтевранец, чем " + this.getFullName() + ".");
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
