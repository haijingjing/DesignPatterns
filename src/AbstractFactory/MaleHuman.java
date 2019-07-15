package AbstractFactory;

public class MaleHuman implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlaceHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
