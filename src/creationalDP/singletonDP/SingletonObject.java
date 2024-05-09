package creationalDP.singletonDP;

public class SingletonObject {
    String message = "Hello";

    private static SingletonObject instance = new SingletonObject();
    public static SingletonObject getInstance() {
        return instance;
    }

    //by making access modifier of default constructor to private
    //we are making sure that this constructor will not be called from outside
    private SingletonObject() {
    }

    public void changeMessage(){
        this.message = this.message + " BATCH 134-135";
    }
}
