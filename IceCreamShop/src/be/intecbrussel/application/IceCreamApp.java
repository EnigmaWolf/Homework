package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamApp {
    public static void main(String[] args) {


        showPriceList();
        totalOrder();
        profitAll();
    }


    private static void orderMagnum(IceCreamSeller seller) {
        System.out.println("You are ordering a magnum: ");
        Eatable magnum = seller.orderMagnum(MagnumType.BLACKCHOCOLATE);
        Eatable magnum1 = seller.orderMagnum(MagnumType.ALPINENUTS);
        System.out.println(magnum + " and " + magnum1);
        magnum.eat();
        magnum1.eat();
    }

    private static void orderIceRocket(IceCreamSeller seller) {
        System.out.println("You are ordering an Ice Rocket ice-cream: ");
        Eatable iceRocket = seller.orderIceRocket();
        System.out.println(iceRocket);
        iceRocket.eat();
    }


    private static void orderCones(IceCreamSeller seller) {
        System.out.println("You are ordering an ice-cream cone with flavors: ");
        Flavor[] order1 = {Flavor.LEMON, Flavor.PISTACHE};
        Flavor[] order2 = {Flavor.VANILLA, Flavor.MOKKA, Flavor.STRACIATELLA};
        Eatable cone1 = new Cone(order1);
        Eatable cone2 = new Cone(order2);
        cone1.eat();
        cone2.eat();
    }

    private static void showPriceList() {
        System.out.println("This is the list of prices on our menu: ");
        PriceList priceList = new PriceList(1.1, 2.5, 1.5);
        printPriceList(priceList);
    }

    private static void printPriceList(PriceList priceList) {
        System.out.println("Price per ball of ice-cream: " + priceList.getBallPrice());
        System.out.println("Price per Ice Rocket is: " + priceList.getRocketPrice());
        System.out.println("Standard Magnum Price is: " + priceList.getMagnumStandardPrice());
        for (MagnumType type : MagnumType.values()) {
            System.out.printf(type + " is " + "%.2f, \n", priceList.getMagnumPrice(type));
        }
    }

    private static void totalOrder() {
        PriceList priceList = new PriceList(1.1, 2.5, 1.5);
        IceCreamSeller seller = new IceCreamSalon(priceList);
        orderMagnum(seller);
        orderIceRocket(seller);
        orderCones(seller);
        profitAll();
    }


    private static void profitAll() {
        IceCreamSeller seller = new IceCreamSalon();
        System.out.println("the profit is: " + seller.getProfit());

    }


}
