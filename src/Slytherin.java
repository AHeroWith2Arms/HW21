public class Slytherin extends Student {
    private int cunning;
    private int determination;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
    }

    @Override
    public void describe() {
        System.out.println(getName() + ": хитрость=" + cunning + ", решительность=" + determination);
    }
}
