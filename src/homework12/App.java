package homework12;

public class App {
    public static void main(String[] args) {
        Author yudkowsky = new Author("Элиезер", "Юдковский");
        Author dawkins = new Author("Ричард", "Докинз");
        Book theGodDelusion = new Book("Бог как иллюзия", dawkins, 2006);
        System.out.println(theGodDelusion);
        Book harryPotter = new Book("Гарри Поттер и методы рационального мышления", yudkowsky, 2010);
        System.out.println(harryPotter);
        harryPotter.setYear(2015);
        System.out.println(harryPotter);
    }
}
