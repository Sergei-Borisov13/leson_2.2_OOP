public class PrintServese {
    public void print(Hogwarts[] people) {
        System.out.println("Всего учеников Хогвартса " + people.length);
        for (Hogwarts hogwarts : people) {
            System.out.println("Имя " + hogwarts.getName() + ", Фамилия " + hogwarts.getFirstname() +
                    ", Сила магии " + hogwarts.getMagicPower() + ", дистанция трансгрессии " + hogwarts.getTransgressionDistance());
        }
    }
    public void print(Gryffindor[] gryffindors) {
        System.out.println();
        System.out.println("Учеников Гриффиндора " + gryffindors.length);
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println("Имя " + gryffindor.getName() + ", Фамилия " + gryffindor.getFirstname() + ", Сила магии "
                    + gryffindor.getMagicPower() + ", дистанция трансгрессии " + gryffindor.getTransgressionDistance() +
                    ", благородство " + gryffindor.getNobility() + ", честь " + gryffindor.getHonor() + ", храбрость " +
                    gryffindor.getBravery());
        }
    }
    public void print(Slytherin[] slytherins) {
        System.out.println();
        System.out.println("Учеников Слизерина " + slytherins.length);
        for (Slytherin slytherin : slytherins) {
            System.out.println("Имя " + slytherin.getName() + ", Фамилия " + slytherin.getFirstname() + ", Сила магии "
                    + slytherin.getMagicPower() + ", дистанция трансгрессии " + slytherin.getTransgressionDistance() +
                    ", хитрость " + slytherin.getTrick() + ", решительность " + slytherin.getDetermination() + ", амбициозность " +
                    slytherin.getAmbition() + ", находчивость " + slytherin.getIngenuity() + ", жажда власти " + slytherin.getThirstForPower());
        }
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println();
        System.out.println("Учеников Пуффендуя " + hufflepuffs.length);
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Имя " + hufflepuff.getName() + ", Фамилия " + hufflepuff.getFirstname() + ", Сила магии "
                    + hufflepuff.getMagicPower() + ", дистанция трансгрессии " + hufflepuff.getTransgressionDistance() +
                    ", трудолюбие " + hufflepuff.getDiligence() + ", верность " + hufflepuff.getFidelity() + ", честность " +
                    hufflepuff.getHonesty());
        }
        System.out.println();
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println();
        System.out.println("Учеников Когтеврана " + ravenclaws.length);
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Имя " + ravenclaw.getName() + ", Фамилия " + ravenclaw.getFirstname() + ", Сила магии "
                    + ravenclaw.getMagicPower() + ", дистанция трансгрессии " + ravenclaw.getTransgressionDistance() +
                    ", ум " + ravenclaw.getMind() + ", мудрость " + ravenclaw.getWisdom() + ", остроумие " +
                    ravenclaw.getWittiness() + ", творчество " + ravenclaw.getCreativity());
        }
    }
    public  void comparisonOfStudents(Gryffindor[] gryffindors) {
        if (gryffindors[0].getSumOfPoints() > gryffindors[1].getSumOfPoints()) {
            System.out.println(gryffindors[0].getName() + " лучший Гриффиндорец, чем " + gryffindors[1].getName());
        }else System.out.println(gryffindors[1].getName() + " лучший Гриффиндорец, чем " + gryffindors[0].getName());
    }

    public  void comparisonOfStudents (Slytherin[] slytherins) {
        if (slytherins[0].getSumOfPoints() > slytherins[1].getSumOfPoints()) {
            System.out.println(slytherins[0].getName() + " лучший Слизеринец, чем " + slytherins[1].getName());
        }else System.out.println(slytherins[1].getName() + " лучший Слизеринец, чем " + slytherins[0].getName());
    }
    public  void comparisonOfStudents (Hufflepuff[] hufflepuffs) {
        if (hufflepuffs[0].getSumOfPoints() > hufflepuffs[1].getSumOfPoints()) {
            System.out.println(hufflepuffs[0].getName() + " лучший Пуффендуец, чем " + hufflepuffs[1].getName());
        }else System.out.println(hufflepuffs[1].getName() + " лучший Пуффендуец, чем " + hufflepuffs[0].getName());
    }
    public  void comparisonOfStudents (Ravenclaw[] ravenclaws) {
        if (ravenclaws[0].getSumOfPoints() > ravenclaws[1].getSumOfPoints()) {
            System.out.println(ravenclaws[0].getName() + " лучший Когтевранец, чем " + ravenclaws[1].getName());
        }else System.out.println(ravenclaws[1].getName() + " лучший Когтевранец, чем " + ravenclaws[0].getName());
    }

    public void topStudents(Hogwarts[] hogwarts, int id, int id2) {

        if (hogwarts[id].getSumOfPoints() > hogwarts[id2].getSumOfPoints()) {
            System.out.println(hogwarts[id].getName() + " обладает бОльшей мощностью магии, чем " + hogwarts[id2].getName());
        }else System.out.println(hogwarts[id2].getName() + " обладает бОльшей мощностью магии, чем " + hogwarts[id].getName());
    }
}
