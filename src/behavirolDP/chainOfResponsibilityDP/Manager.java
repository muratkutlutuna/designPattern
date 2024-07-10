package behavirolDP.chainOfResponsibilityDP;

public class Manager extends Approver{

    public Manager(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 500) {
            System.out.println("Bank manager approved");
            System.out.println("*********************");
        } else if (chief != null) {
            System.out.println("Requested amount exceeds limit that manager can approve. You are directed to general manager");
            return chief.approveLoan(amount);
        }

        return false;
    }
}
