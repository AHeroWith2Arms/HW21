public class Gryffindor extends Student {
    private int courage;
    private int honor;
    private int nobility;

    public Gryffindor(String name, int magicPower, int transgression, int courage, int honor) {
        super(name, magicPower, transgression);
        this.courage = courage;
        this.honor = honor;
        this.nobility = (int)(Math.random() * 101);
    }

    @Override
    public void describe() {
        System.out.println(getName() + ": смелость=" + courage + ", честь=" + honor + ", благородство=" + nobility);
    }

    public static void compare(Gryffindor a, Gryffindor b) {
        int scoreA = a.courage + a.honor + a.nobility;
        int scoreB = b.courage + b.honor + b.nobility;
        System.out.println((scoreA > scoreB ? a.getName() : b.getName()) + " лучше!");
    }
}
