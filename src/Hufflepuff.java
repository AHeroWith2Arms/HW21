public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareHufflepuff(Hufflepuff other) {
        int thisScore = this.hardWork + this.loyalty + this.honesty;
        int otherScore = other.hardWork + other.loyalty + other.honesty;

        if (thisScore > otherScore) {
            System.out.println(this.getClass().getSimpleName() + " is better than " + other.getClass().getSimpleName());
        } else if (thisScore < otherScore) {
            System.out.println(other.getClass().getSimpleName() + " is better than " + this.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " and " + other.getClass().getSimpleName() + " are equal");
        }
    }

    public String describeStudent() {
        return super.describeStudent() + ", Hard Work: " + hardWork + ", Loyalty: " + loyalty + ", Honesty: " + honesty;
    }
}