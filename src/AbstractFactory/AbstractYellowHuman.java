package AbstractFactory;

public abstract class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("yellow is yellow");
    }

    @Override
    public void talk() {
        System.out.println("yellow talk");
    }
}
