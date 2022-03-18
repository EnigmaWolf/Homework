package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public abstract class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock = new Stock();
    private double profit = 0;

    public IceCreamCar(PriceList priceList, Stock stock) {
        super();
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        Cone newCone = prepareCone(balls);
        return newCone;
    }
    public Cone prepareCone(Flavor[] balls) {
        Cone newCone = new Cone(balls);
        int nrCones = stock.getCones();
        int nrBalls = stock.getBalls();


        return newCone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket anIceRocket = prepareIceRocket();
        return anIceRocket;
    }

    public IceRocket prepareIceRocket() {
        int nrIceRockets = stock.getIceRockets();
        IceRocket anIceRocket=null;
        if (nrIceRockets>0) {
            nrIceRockets--;
            profit = profit + priceList.getRocketPrice();
            anIceRocket = new IceRocket();
            stock.setIceRockets(nrIceRockets);
        }

        return anIceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum aMagnum = prepareMagnum(type);
        return aMagnum;
    }

    public Magnum prepareMagnum(MagnumType type) {
        int nrMagnum = stock.getMagni();
        profit = profit + priceList.getMagnumPrice(type);
        Magnum aMagnum = new Magnum(type);
        stock.setMagni(nrMagnum);
        return aMagnum;
    }

    @Override
    public double getProfit() {
        return profit;

    }

}
