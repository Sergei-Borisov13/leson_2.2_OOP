public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wittiness;
    private int creativity;
    private final int sumOfPoints;



    public Ravenclaw(String name, String firstname, int magicPower, int transgressionDistance, int mind, int wisdom, int wittiness, int creativity) {
        super(name, firstname, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
        this.sumOfPoints = mind + wisdom + wittiness + creativity;
    }
    public int getSumOfPoints() {
        return sumOfPoints;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

}
