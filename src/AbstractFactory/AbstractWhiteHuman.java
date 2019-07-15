package AbstractFactory;

public abstract class AbstractWhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("white is white");
    }

    @Override
    public void talk() {
        System.out.println("white talk");
    }
}
