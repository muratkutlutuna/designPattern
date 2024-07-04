package behavirolDP.mediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher{

    //dispatcher should know which actor/expert should answer the question on topic
    Map<String, Expert> registeredExperts = new HashMap<>();

    //all experts/actors should be registered first
    void register(String topic, Expert expert) {
        registeredExperts.put(topic, expert);
    }


    @Override
    public void dispatch(String topic, String message) {
        //get message from actors/experts
        //first we need to find topic
        Expert expert = registeredExperts.get(topic);
        if (expert == null) {
            System.out.println("no expert/actor registered for this topic");
        } else {
            expert.receiveMessage(message);
        }
    }
}
