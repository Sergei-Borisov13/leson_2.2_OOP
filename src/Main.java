public class Main {



    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер", 90, 65),
                new Hogwarts("Гермиона", "Грейнджер", 70, 86),
                new Hogwarts("Рон", "Уизли", 65, 50),
                new Hogwarts("Драко", "Малфой", 81, 70),
                new Hogwarts("Грэхэм", "Монтегю", 50, 40),
                new Hogwarts("Грегори", "Гойл", 52, 48),
                new Hogwarts("Чжоу", "Чанг", 41, 63),
                new Hogwarts("Падма", "Патил", 48, 31),
                new Hogwarts("Маркус", "Белби", 49, 50),
                new Hogwarts("Захария", "Смит", 42, 90),
                new Hogwarts("Седрик", "Диггори", 84, 68),
                new Hogwarts("Джастин", "Финч-Флетчли", 71, 61),
        };
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри", "Поттер", 90, 65, 98, 100, 95),
                new Gryffindor("Гермиона", "Грейнджер", 70, 86, 88, 95, 80),
                new Gryffindor("Рон", "Уизли", 65, 50, 71, 96, 80),
        };
        Slytherin[] slytherin = {
                new Slytherin("Драко", "Малфой", 81, 70, 70, 56, 90, 45, 88),
                new Slytherin("Грэхэм", "Монтегю", 50, 40, 60, 58, 45, 51, 42),
                new Slytherin("Грегори", "Гойл", 52, 48, 65, 60, 51, 48, 72),
        };
        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу", "Чанг", 41, 63, 61, 75, 64, 21),
                new Ravenclaw("Падма", "Патил", 48, 31, 48, 28, 96, 38),
                new Ravenclaw("Маркус", "Белби", 49, 50, 68, 45, 41, 55),
        };
        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария", "Смит", 42, 90, 48, 54, 68),
                new Hufflepuff("Седрик", "Диггори", 84, 68, 58, 52, 74),
                new Hufflepuff("Джастин", "Финч-Флетчли", 71, 61, 56, 68, 22),
        };
        PrintServese printServese = new PrintServese();
        printServese.print(hogwarts);
        printServese.print(gryffindor);
        printServese.print(slytherin);
        printServese.print(ravenclaw);
        printServese.print(hufflepuff);
        printServese.comparisonOfStudents(gryffindor);
        printServese.comparisonOfStudents(slytherin);
        printServese.comparisonOfStudents(hufflepuff);
        printServese.comparisonOfStudents(ravenclaw);
        printServese.topStudents(hogwarts, 3, 7);

    }
}