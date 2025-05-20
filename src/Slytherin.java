public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerHunger;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int powerHunger) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerHunger = powerHunger;
    }

    public void compareSlytherin(Slytherin other) {
        int thisScore = this.cunning + this.determination + this.ambition + this.resourcefulness + this.powerHunger;
        int otherScore = other.cunning + other.determination + other.ambition + other.resourcefulness + other.powerHunger;

        if (thisScore > otherScore) {
            System.out.println(this.getClass().getSimpleName() + " is better than " + other.getClass().getSimpleName());
        } else if (thisScore < otherScore) {
            System.out.println(other.getClass().getSimpleName() + " is better than " + this.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " and " + other.getClass().getSimpleName() + " are equal");
        }
    }

    public String describeStudent() {
        return super.describeStudent() + ", Cunning: " + cunning + ", Determination: " + determination + ", Ambition: " + ambition + ", Resourcefulness: " + resourcefulness + ", Power Hunger: " + powerHunger;
    }
}