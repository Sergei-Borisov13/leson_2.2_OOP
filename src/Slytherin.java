public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int ingenuity;
    private final int thirstForPower;
    private final int sumOfPoints;



    public Slytherin(String name, String firstname, int magicPower, int transgressionDistance, int trick, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(name, firstname, magicPower, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
        this.sumOfPoints = trick + determination + ambition + ingenuity + thirstForPower;
    }
    public int getSumOfPoints() {
        return sumOfPoints;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }


}
