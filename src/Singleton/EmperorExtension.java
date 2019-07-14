package Singleton;

import java.util.ArrayList;
import java.util.Random;


//有上线的多例模式
public class EmperorExtension {
    private static int maxNumofEmperor = 2;

    private static ArrayList<String> nameList = new ArrayList<>();

    private static ArrayList<EmperorExtension> emperorList = new ArrayList<>();

    private static int countNumOfEmperor = 0;

    static {
        for(int i = 0; i < maxNumofEmperor; i++){
            emperorList.add(new EmperorExtension("emperor " + i));
        }
    }
    private EmperorExtension(){}

    private EmperorExtension(String name){
        nameList.add(name);
    }

    public static EmperorExtension getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumofEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
