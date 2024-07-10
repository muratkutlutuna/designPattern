package behavirolDP.mediatorDP;

public class MediatorRunner {
    public static void main(String[] args) {
        MediatorRunner runner = new MediatorRunner();
        runner.mediator();
    }
    void mediator(){
        //dispatcher
        MessageDispatcher dispatcher = new MessageDispatcher();

        //create 3 experts
        Expert chemistryExpert = new MessageExpert("ChemistryExpert", dispatcher);
        Expert mathExpert = new MessageExpert("MathExpert", dispatcher);
        Expert biologyExpert = new MessageExpert("BiologyExpert", dispatcher);

        //register experts on dispatcher
        dispatcher.register("chemistry", chemistryExpert);
        dispatcher.register("mathematics", mathExpert);
        dispatcher.register("biology", biologyExpert);

        //messages of experts from each
        chemistryExpert.sendMessage("mathematics", "Message about Math");
        chemistryExpert.sendMessage("biology", "Message about Biology");
        mathExpert.sendMessage("chemistry", "Message about Chemistry");

    }
}
