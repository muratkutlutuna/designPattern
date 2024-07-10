package behavirolDP.chainOfResponsibilityDP;

public class GeneralManager extends Approver{
    public GeneralManager() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("General manager approved");
        System.out.println("*********************");
        return true;
    }
}
