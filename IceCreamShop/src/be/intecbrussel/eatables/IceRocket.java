package be.intecbrussel.eatables;

public class IceRocket implements Eatable{
    public IceRocket() {

    }

    @Override
    public void eat() {
        System.out.println("You are eating an IceRocket ice-cream!");
    }

    @Override
    public String toString() {
        return "IceRocket served!";

    }
}
