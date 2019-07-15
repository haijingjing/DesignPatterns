package AbstractFactory;

public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("black is black");
    }

    @Override
    public void talk() {
        System.out.println("black talk");
    }
}
