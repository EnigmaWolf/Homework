package be.intecbrussel.eatables;

public class Magnum implements Eatable{

    private MagnumType type;

    public Magnum(MagnumType type) {
        this.type = type; //MagnumType.WHITECHOCOLATE;


        }

    public MagnumType getType() {
        return type;
    }


    @Override
    public void eat() {
        System.out.println("You are eating a Magnum of type " + getType());
    }

    @Override
    public String toString() {
        return "A Magnum: {" +
                "type=" + type +
                '}';
    }
}
