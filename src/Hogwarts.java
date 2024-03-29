public abstract class Hogwarts {

        private final String fullName;
        private final int magic;
        private final int transgression;
        public Hogwarts(String fullName, int magic, int transgression) {
                this.fullName = fullName;
                this.magic = magic;
                this.transgression = transgression;
        }

        public String getFullName() {
                return fullName;
        }

        public int getMagic() {
                return magic;
        }

        public int getTransgression() {
                return transgression;
        }

        public static void compareStudentsByBasicSkills (Hogwarts student1, Hogwarts student2, int compareParameter) {

               switch (compareParameter) {
                       case 1:
                               if (student1.getMagic() < 0 || student1.getMagic() > 100 || student2.getMagic() < 0 || student2.getMagic() > 100) {
                                       System.out.println("Навык _магия_ не может быть отрицательным или иметь значение больше 100");
                                       System.exit(1);}

                                       if (student1.getMagic() > student2.getMagic()) {
                                               System.out.println(student1.getFullName() + " обладает бОльшей мощностью магии, чем " + student2.getFullName() + ".");
                                       } else if (student1.getMagic() < student2.getMagic()) {
                                               System.out.println(student2.getFullName() + " обладает бОльшей мощностью магии, чем " + student1.getFullName() + ".");
                                       } else {
                                               System.out.println(student1.getFullName() + " и " + student2.getFullName() + " обладают равной мощностью магии.");
                                       }
                               break;
                       case 2:
                               if (student1.getTransgression() < 0 || student1.getTransgression() > 100 || student2.getTransgression() < 0 || student2.getTransgression() > 100) {
                                       System.out.println("Навык _трансгрессия_ не может быть отрицательным или иметь значение больше 100");
                                       System.exit(1);}

                                       if (student1.getTransgression() > student2.getTransgression()) {
                                               System.out.println(student1.getFullName() + " обладает бОльшей мощностью трансгрессии, чем " + student2.getFullName() + ".");
                                       } else if (student1.getTransgression() < student2.getTransgression()) {
                                               System.out.println(student2.getFullName() + " обладает бОльшей мощностью трансгрессии, чем " + student1.getFullName() + ".");
                                       } else {
                                               System.out.println(student1.getFullName() + " и " + student2.getFullName() + " обладают равной мощностью трансгрессии.");
                                       }

                               }
        }
}
