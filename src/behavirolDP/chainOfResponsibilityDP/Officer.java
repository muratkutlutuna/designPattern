package behavirolDP.chainOfResponsibilityDP;

public class Officer extends Approver {

    //manager of this class
    public Officer(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 100) {
            System.out.println("Bank officer approved");
            System.out.println("*********************");
        } else if (chief != null) {
            System.out.println("Requested amount exceeds limit that officer can approve. You are directed to manager");
            return chief.approveLoan(amount);
        }

        return false;
    }
}
