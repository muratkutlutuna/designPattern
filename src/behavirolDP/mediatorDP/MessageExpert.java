package behavirolDP.mediatorDP;

public class MessageExpert implements Expert{

    //expert field
    String name;
    //they should know the dispatcher
    Dispatcher dispatcher;

    //constructor
    public MessageExpert(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name+" received message "+message);
    }

    @Override
    public void sendMessage(String topic, String message) {
        //expert/actors will send message through dispatcher
        dispatcher.dispatch(topic, message);
    }
}
