public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void compareRavenclaw(Ravenclaw other) {
        int thisScore = this.intelligence + this.wisdom + this.wit + this.creativity;
        int otherScore = other.intelligence + other.wisdom + other.wit + other.creativity;

        if (thisScore > otherScore) {
            System.out.println(this.getClass().getSimpleName() + " is better than " + other.getClass().getSimpleName());
        } else if (thisScore < otherScore) {
            System.out.println(other.getClass().getSimpleName() + " is better than " + this.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " and " + other.getClass().getSimpleName() + " are equal");
        }
    }

    public String describeStudent() {
        return super.describeStudent() + ", Intelligence: " + intelligence + ", Wisdom: " + wisdom + ", Wit: " + wit + ", Creativity: " + creativity;
    }
}