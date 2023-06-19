public class Main {
    public static void main(String[] args) {
        Gryffindor Ron = new Gryffindor("Ron Weasley", 30, 30, 30, 30, 30);
        Gryffindor Hermoine = new Gryffindor("Hermoine Granger",80,80,80,80,80);

        Hufflepuff Zakharia = new Hufflepuff("Zakharia Smith",50,50,50,50,50);

        Ron.compare(Hermoine);
        Ron.compare(Zakharia);
    }
}