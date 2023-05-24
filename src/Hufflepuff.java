public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int fidelity;
    private int honesty;
    private final int sumOfPoints;



    public Hufflepuff(String name, String firstname, int magicPower, int transgressionDistance, int diligence, int fidelity, int honesty) {
        super(name, firstname, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
        this.sumOfPoints = diligence + fidelity + honesty;
    }
    public int getSumOfPoints() {
        return sumOfPoints;
    }
    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

}
