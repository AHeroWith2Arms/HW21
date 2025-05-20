public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Harry Potter", 90, 50, 85, 80, 95);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 95, 60, 90, 85, 80);
        Gryffindor ron = new Gryffindor("Ron Weasley", 80, 40, 70, 75, 85);

        Hufflepuff zachariah = new Hufflepuff("Zachariah Smith", 70, 30, 80, 85, 90);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 85, 45, 90, 80, 85);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 75, 35, 85, 90, 80);

        Ravenclaw cho = new Ravenclaw("Cho Chang", 80, 50, 90, 85, 80, 95);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 85, 55, 95, 90, 85, 80);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 75, 40, 80, 85, 90, 85);

        Slytherin draco = new Slytherin("Draco Malfoy", 85, 50, 90, 80, 95, 85, 90);
        Slytherin graham = new Slytherin("Graham Montague", 80, 45, 85, 90, 80, 80, 85);
        Slytherin gregory = new Slytherin("Gregory Goyle", 70, 40, 80, 85, 75, 80, 90);

        System.out.println("Harry Potter: " + harry.describeStudent());
        System.out.println("Hermione Granger: " + hermione.describeStudent());
        System.out.println("Cedric Diggory: " + cedric.describeStudent());
        System.out.println("Cho Chang: " + cho.describeStudent());
        System.out.println("Draco Malfoy: " + draco.describeStudent());

        System.out.println("\nComparing Gryffindor students:");
        harry.compareGryffindor(hermione);

        System.out.println("\nComparing Hufflepuff students:");
        cedric.compareHufflepuff(zachariah);

        System.out.println("\nComparing Ravenclaw students:");
        cho.compareRavenclaw(padma);

        System.out.println("\nComparing Slytherin students:");
        draco.compareSlytherin(graham);

        System.out.println("\nComparing Hogwarts students:");
        harry.compareHogwartsStudents(draco);
    }
}