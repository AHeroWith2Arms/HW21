public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareGryffindor(Gryffindor other) {
        int thisScore = this.nobility + this.honor + this.bravery;
        int otherScore = other.nobility + other.honor + other.bravery;

        if (thisScore > otherScore) {
            System.out.println(this.getClass().getSimpleName() + " is better than " + other.getClass().getSimpleName());
        } else if (thisScore < otherScore) {
            System.out.println(other.getClass().getSimpleName() + " is better than " + this.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " and " + other.getClass().getSimpleName() + " are equal");
        }
    }

    public String describeStudent() {
        return super.describeStudent() + ", Nobility: " + nobility + ", Honor: " + honor + ", Bravery: " + bravery;
    }
}