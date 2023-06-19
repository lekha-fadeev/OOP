public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honor;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honor) {
        super(name, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    @Override
    int calculateSpecificScore() {
        return this.diligence + this.loyalty + this.honor;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Пуффендуец, чем %s", best.getName(),worst.getName()));
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                '}';
    }
}
