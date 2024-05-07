package SingletonMethod.Naive;

public final class Singleton {
    private static final Singleton instance = new Singleton();
    private String value;

    private Singleton(){
        System.out.println("Object created");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
