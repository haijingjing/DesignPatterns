package Singleton;

public class Minister {
    public static void main(String[] args){
        int ministerNum = 5;
        for(int i = 1; i <= ministerNum; i++){
            EmperorExtension emperorExtension = EmperorExtension.getInstance();
            System.out.print("第" + i + "个大臣参拜第是： ");
            emperorExtension.say();
        }
    }
}
