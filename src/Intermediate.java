public class Intermediate {


    private Exp exp;
    private  Lexicon lexicon;
    private String name;

    public Exp getExp() {
        return exp;
    }

    public Lexicon getLexicon() {
        return lexicon;
    }

    public String getName() {
        return name;
    }

    public Intermediate(Exp exp, Lexicon lexicon, String name) {
        this.exp = exp;
        this.lexicon = lexicon;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Name" + getName());
        System.out.println("Lexicon" + lexicon.getLexicon());
        System.out.println("exp"+getExp());
    }
    public final void infoExp(){
        System.out.println("exp"+getExp());
    }
}
