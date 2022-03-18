package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;
    private double totalProfit = 0;

    public IceCreamSalon() {
        this(new PriceList());
    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList=priceList;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        Cone newCone = new Cone(Flavor.values());
        return newCone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket anIceRocket = new IceRocket();
        //totalProfit+= priceList.getRocketPrice();
        return anIceRocket;

    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum aMagnum = new Magnum(type);
        return aMagnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
