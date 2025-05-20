public class Hogwarts {
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareHogwartsStudents(Hogwarts other) {
        int thisScore = this.magicPower + this.transgressionDistance;
        int otherScore = other.magicPower + other.transgressionDistance;

        if (thisScore > otherScore) {
            System.out.println(this.getClass().getSimpleName() + " is better than " + other.getClass().getSimpleName());
        } else if (thisScore < otherScore) {
            System.out.println(other.getClass().getSimpleName() + " is better than " + this.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " and " + other.getClass().getSimpleName() + " are equal");
        }
    }

    public String describeStudent() {
        return "Magic Power: " + magicPower + ", Transgression Distance: " + transgressionDistance;
    }
}