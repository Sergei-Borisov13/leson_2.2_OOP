public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private final int sumOfPoints;



    public Gryffindor(String name, String firstname, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, firstname , magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.sumOfPoints = nobility + honor + bravery;
    }
    public int getSumOfPoints() {
        return sumOfPoints;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


}
