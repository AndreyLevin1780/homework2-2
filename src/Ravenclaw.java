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

    public static void printStudent(Ravenclaw student) {
        System.out.println();
        System.out.println(student.toString());
    }
    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {

        if (student1.getWisdom() < 0 || student1.getCuteness() < 0 || student1.getCreativeness() < 0 || student2.getWisdom() < 0 || student2.getCuteness() < 0 || student2.getCreativeness() < 0) {
            System.out.println("Навык ученика не может иметь отрицательное значение.");
            System.exit(1);
        } else if (student1.getWisdom() > 100 || student1.getCuteness() > 100 || student1.getCreativeness() > 100 || student2.getWisdom() > 100 || student2.getCuteness() > 100 || student2.getCreativeness() > 100) {
            System.out.println("Навык ученика не может быть больше 100.");
            System.exit(1);
        }

        int student1totalScore = student1.getWisdom() + student1.getCuteness() + student1.getCreativeness();
        int student2totalScore = student2.getWisdom() + student2.getCuteness() + student2.getCreativeness();

        System.out.println("У " + student1.getFullName() +
                " мудрость = " + student1.getWisdom() + " баллов, " +
                "остроумие = " + student1.getCuteness() + " баллов, " +
                "творчество = " + student1.getCreativeness() + " баллов.");
        System.out.println("У " + student2.getFullName() +
                " мудрость = " + student2.getWisdom() + " баллов, " +
                "остроумие = " + student2.getCuteness() + " баллов, " +
                "творчество = " + student2.getCreativeness() + " баллов.");
        System.out.println();

        if (student1totalScore > student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + "сумма баллов равна " + student2totalScore);
            System.out.println(student1.getFullName() + " лучший Когтевранец, чем " + student2.getFullName() + ".");
            System.out.println();
        } else if (student1totalScore < student2totalScore) {
            System.out.println("У " + student1.getFullName() +
                    " сумма баллов равна " + student1totalScore +
                    ", а у " + student2.getFullName() + " сумма баллов равна " + student2totalScore);
            System.out.println(student2.getFullName() + " лучший Когтевранец, чем " + student1.getFullName() + ".");
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
