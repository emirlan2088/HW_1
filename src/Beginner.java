public final class Beginner extends Intermediate {
    private String teacher;

    public String getTeacher() {
        return teacher;
    }

    public Beginner(Exp exp, Lexicon lexicon, String name) {
        super(exp, lexicon, name);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Teacher" + getTeacher());
    }
}
