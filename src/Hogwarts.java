public class Hogwarts {
    private String name;
    private String firstname;
    private int magicPower;
    private int transgressionDistance;
    private final int sumOfPoints;





    public Hogwarts(String name, String firstname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.firstname = firstname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
        this.sumOfPoints = magicPower + transgressionDistance;
    }
    public int getSumOfPoints() {
        return sumOfPoints;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

}
