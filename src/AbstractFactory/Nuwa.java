package AbstractFactory;

public class Nuwa {

    public static void main(String[] args) {

        HumanFactory maleHumanFactory = new MaleHuman();

        HumanFactory femaleHumanFactory = new FemaleHuman();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();

        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
    }



}
