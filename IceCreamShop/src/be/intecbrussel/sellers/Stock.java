package be.intecbrussel.sellers;

public class Stock {
    private int iceRockets = 300;
    private int cones = 1000;
    private int balls = 800;
    private int magni = 1500;

    public Stock() {
        System.out.println("This is stock take: ");
    }

    public int getIceRockets() {

        return iceRockets;
    }
    public void setIceRockets(int iceRockets) {

        this.iceRockets = iceRockets;
    }
    public int getCones() {
        return cones;
    }
    public void setCones(int cones) {

        this.cones = cones;
    }
    public int getBalls() {

        return balls;
    }
    public void setBalls(int balls) {

        this.balls = balls;
    }
    public int getMagni() {
        return magni;
    }
    public void setMagni(int magni) {
        this.magni = magni;
    }
}
