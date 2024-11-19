public class Main {
    public static void main(String[] args) {
        Intermediate objectA = new Intermediate(Exp.THREE_YEARS, new Lexicon(1500), "Alex");
        Beginner objectB = new Beginner(Exp.TWO_YEARS, new Lexicon(1200), "John");
        Beginner objectC = new Beginner(Exp.ONE_YEAR, new Lexicon(1000), "Dani");

        objectA.getInfo();
        objectA.infoExp();

        objectB.getInfo();

        objectC.getInfo();
    }
}