public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 80, 90, 85, 95);
        Slytherin draco = new Slytherin("Драко Малфой", 85, 80, 90, 95);

        harry.describe();
        draco.describe();

        Gryffindor.compare(harry, new Gryffindor("Рон Уизли", 75, 80, 70, 85));
        compareStudents(harry, draco);
    }

    public static void compareStudents(Student a, Student b) {
        if (a.getMagicPower() + a.getTransgression() > b.getMagicPower() + b.getTransgression()) {
            System.out.println(a.getName() + " сильнее!");
        } else {
            System.out.println(b.getName() + " сильнее!");
        }
    }
}
