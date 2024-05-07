package SingletonMethod.Naive;

public class SingletonClient {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.setValue("gg");
        System.out.println(singleton.getValue());
    }
}
