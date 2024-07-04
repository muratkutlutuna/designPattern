package behavirolDP.mediatorDP;

public interface Expert {
    void receiveMessage(String message);

    void sendMessage(String topic, String message);
}
