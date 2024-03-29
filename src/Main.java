//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Griffindor gPotter = new Griffindor("Гарри Поттер", 99, 96, 69,70,54);
        Griffindor hGranger = new Griffindor("Гермиона Грейнджер", 86, 100, 78,53,55);
        Griffindor rWeasley = new Griffindor("Рон Уизли", 70, 54, 66,87,38);

        Hufflepuff zSmith = new Hufflepuff("Захария Смит", 75, 84, 64, 93, 53);
        Hufflepuff cDiggory = new Hufflepuff("Седрик Диггори", 47, 85, 54, 94,80);
        Hufflepuff jFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 75, 58, 93, 68, 82);

        Ravenclaw cChang = new Ravenclaw("Чжоу Чанг", 74, 45, 67, 86, 64);
        Ravenclaw pPatil = new Ravenclaw("Падма Патил", 84, 93,54, 56, 73);
        Ravenclaw mBelby = new Ravenclaw("Маркус Белби", 57, 84, 83,92,53);

        Slytherin dMalfoy = new Slytherin("Драко Малфой", 95, 96,45,86,45,34,93);
        Slytherin gMontague = new Slytherin("Грэхэм Монтегю", 74,93,92,63,85,53,59);
        Slytherin gGoyle = new Slytherin("Грегори Гойл", 94,53,69,63,53,48,84);

        gPotter.compareStudents(rWeasley);
        cDiggory.compareStudents(jFinchFletchley);
        cChang.compareStudents(mBelby);
        gGoyle.compareStudents(gMontague);
        gPotter.compareStudentsByBasicSkills(dMalfoy, 2);
        hGranger.printStudent(hGranger);
        zSmith.printStudent(zSmith);
        pPatil.printStudent(pPatil);
        gMontague.printStudent(gMontague);
    }
}