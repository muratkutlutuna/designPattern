package creationalDP.singletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //we can create new different obj using Constructor
//        SingletonObject obj2 = new SingletonObject();
//        SingletonObject obj3 = new SingletonObject();

        SingletonObject obj1 = SingletonObject.getInstance();
        System.out.println("Message by OBJ1: "+obj1.message);// HELLO
        obj1.changeMessage();
        System.out.println("Message by OBJ1: "+obj1.message);// HELLO BATCH 134-135

        //test if it is singleton or not
        SingletonObject obj4 = SingletonObject.getInstance();
        System.out.println("Message by OBJ4: "+obj4.message);
    }
}
