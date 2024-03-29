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

        public void compareStudentsByBasicSkills (Hogwarts student, int compareParameter) {

               switch (compareParameter) {
                       case 1:
                               if (this.getMagic() < 0 || this.getMagic() > 100 || student.getMagic() < 0 || student.getMagic() > 100) {
                                       System.out.println("Навык _магия_ не может быть отрицательным или иметь значение больше 100");
                                       System.exit(1);}

                                       if (this.getMagic() > student.getMagic()) {
                                               System.out.println(this.getFullName() + " обладает бОльшей мощностью магии, чем " + student.getFullName() + ".");
                                       } else if (this.getMagic() < student.getMagic()) {
                                               System.out.println(student.getFullName() + " обладает бОльшей мощностью магии, чем " + this.getFullName() + ".");
                                       } else {
                                               System.out.println(this.getFullName() + " и " + student.getFullName() + " обладают равной мощностью магии.");
                                       }
                               break;
                       case 2:
                               if (this.getTransgression() < 0 || this.getTransgression() > 100 || student.getTransgression() < 0 || student.getTransgression() > 100) {
                                       System.out.println("Навык _трансгрессия_ не может быть отрицательным или иметь значение больше 100");
                                       System.exit(1);}

                                       if (this.getTransgression() > student.getTransgression()) {
                                               System.out.println(this.getFullName() + " обладает бОльшей мощностью трансгрессии, чем " + student.getFullName() + ".");
                                       } else if (this.getTransgression() < student.getTransgression()) {
                                               System.out.println(student.getFullName() + " обладает бОльшей мощностью трансгрессии, чем " + this.getFullName() + ".");
                                       } else {
                                               System.out.println(this.getFullName() + " и " + student.getFullName() + " обладают равной мощностью трансгрессии.");
                                       }

                               }
        }
}
