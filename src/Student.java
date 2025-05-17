public class Student {
    private String name;
    private int magicPower;
    private int transgression;

    public Student(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void describe() {}
}
