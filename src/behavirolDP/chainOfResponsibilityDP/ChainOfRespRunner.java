package behavirolDP.chainOfResponsibilityDP;

public class ChainOfRespRunner {
    public static void main(String[] args) {
        ChainOfRespRunner runner = new ChainOfRespRunner();
        runner.chainOfResponsibility();
    }

    void chainOfResponsibility() {
        //there is no manager of this class
        Approver generalManager = new GeneralManager();
        //we need to set manager in constructor
        Approver manager = new Manager(generalManager);

        Approver officer = new Officer(manager);
        System.out.println("Limits for loans: ");
        System.out.println("For officer, max limit is < 100 USD");
        System.out.println("For manager, max limit is < 500 USD");
        System.out.println("For general manager, no limit");
        System.out.println("************************************");
        System.out.println("Requested amount is: 50 USD");
        officer.approveLoan(50);
        System.out.println("Requested amount is: 450 USD");
        officer.approveLoan(450);
        System.out.println("Requested amount is: 750 USD");
        officer.approveLoan(750);
    }
}
