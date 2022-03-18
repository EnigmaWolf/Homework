package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {
    private  double ballPrice = 0;
    private  double rocketPrice = 0;
    private  double magnumStandardPrice = 0;

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public PriceList() {
        this(0,0,0);
    }

    public void setBallPrice(double ballPrice) {

        this.ballPrice = ballPrice;
    }
    public double getBallPrice() {

        return ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {

        this.rocketPrice = rocketPrice;
    }

    public double getRocketPrice() {

        return rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {

        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getMagnumStandardPrice() {

        return magnumStandardPrice;
    }
    public double getMagnumPrice(MagnumType type) {
        double magnumPrice = magnumStandardPrice;
        switch (type) {
            case MILKCHOCOLATE -> {
                magnumPrice = magnumPrice * 1.2;
                break;}
            case WHITECHOCOLATE -> {
                magnumPrice = magnumPrice * 1.3;
                break;}
            case BLACKCHOCOLATE -> {
                magnumPrice = magnumPrice * 1.4;
                break;
            }
            case ALPINENUTS -> {
                magnumPrice = magnumPrice * 1.5;
                break;
            }
            case ROMANTICSTRAWBERRIES -> {
                magnumPrice = magnumPrice * 2;
                break;
            }
        }

        return magnumPrice;
    }

}
