public abstract class Hogwarts {
    private String name;

    public String getName() {
        return name;
    }

    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    abstract int calculateSpecificScore();

    abstract void printCompareOfStudents(Hogwarts best, Hogwarts worst);

    private int calculateGeneralScore(){
        return this.powerOfMagic + this.transgressionDistance;
    }

    public void compare (Hogwarts hogwarts){
        if (this.getClass().equals(hogwarts.getClass())){
            this.compereBySpecific(hogwarts);
        }else {
            this.compereByGeneral(hogwarts);
        }
    }

    private void compereBySpecific(Hogwarts hogwarts){
        int thisScore = this.calculateGeneralScore() + this.calculateSpecificScore();
        int otherScore = hogwarts.calculateGeneralScore() + hogwarts.calculateSpecificScore();

        if (thisScore > otherScore){
            printCompareOfStudents(this, hogwarts);
        }else if (thisScore < otherScore){
            printCompareOfStudents( hogwarts, this);
        }else {
            System.out.println("Ученики одного факультета равны по силе");
        }
    }

    private void compereByGeneral(Hogwarts hogwarts){
        int thisScore = this.calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore();

        if (thisScore > otherScore){
            System.out.println(String.format("Ученик %s сильнее ученика %s", this.name, hogwarts.name));
        }else if (thisScore < otherScore){
            System.out.println(String.format("Ученик %s сильнее ученика %s", hogwarts.name, this.name));
        }else {
            System.out.println("Ученики равны по силе");
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}