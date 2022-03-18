package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceListCar = new PriceList(1.2, 2.2, 2);
        Stock stock = new Stock();

        IceCreamSeller newSeller = new IceCreamSalon(priceListCar);
        Flavor[] order1 = {Flavor.MOKKA, Flavor.VANILLA, Flavor.STRAWBERRY};
        Eatable[] order2 = {newSeller.orderMagnum(MagnumType.WHITECHOCOLATE)};
    }
}
